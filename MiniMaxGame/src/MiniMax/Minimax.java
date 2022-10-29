package MiniMax;

import java.util.*;
 
public final class Minimax {
 
    private Minimax() {}
 
    public static State minimaxDecision(State state) {
        return state.getActions().stream().max(Comparator.comparing(Minimax::minValue)).get();
    }
 
    private static double maxValue(State state) {
        if(state.isTerminal()){
            return state.getUtility();
        }
        return state.getActions().stream().map(Minimax::minValue).max(Comparator.comparing(Double::valueOf)).get();
    }
 
    private static double minValue(State state) {
        if(state.isTerminal()){
            return state.getUtility();
        }
        System.out.println(state.getActions().stream().map(Minimax::maxValue).min(Comparator.comparing(Double::valueOf)).get());
        return state.getActions().stream().map(Minimax::maxValue).min(Comparator.comparing(Double::valueOf)).get();
    }
 
    public static class State {                                 // Δημιουργία μεθόδου State
 
        public int state;                                       // Αρχικοποίηση μεταβλητών
        final boolean firstPlayer;
        final boolean secondPlayer;
        private final int k;
 
        public State(int state, boolean firstPlayer, int k){    // Constructor
            this.k = k;
            this.state = state;
            this.firstPlayer = firstPlayer;
            this.secondPlayer = !firstPlayer;
        }
 
        Collection<State> getActions(){                         // Yπολογισμός των επόμενων πιθανών καταστάσεων
            List<State> actions = new LinkedList<>();
            if(state > k-1){
                actions.add(new State(state-k, secondPlayer, k));
            }
            if(state > 1){
                actions.add(new State(state-2, secondPlayer, k));
            }
            if(state > 0){
                actions.add(new State(state-1, secondPlayer, k));
            }
            return actions;            
        }
 
        public boolean isTerminal() {
            return state < 1;
        }
 
        double getUtility() {
            if(firstPlayer)
                return -1;
            else
                return 1;
        }
    }
}