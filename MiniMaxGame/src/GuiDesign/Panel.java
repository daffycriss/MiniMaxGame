package GuiDesign;

import MiniMax.Minimax;
import javax.swing.JOptionPane;

public final class Panel extends javax.swing.JFrame {

    public Panel() {
        initComponents();
        Line();Welcome();Details1();Details2();Details3();Details4();Details5();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Details1 = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Details2 = new javax.swing.JLabel();
        Details3 = new javax.swing.JLabel();
        Details4 = new javax.swing.JLabel();
        Details5 = new javax.swing.JLabel();
        newgamebutton = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        initcubeslabel = new javax.swing.JLabel();
        kcubeslabel = new javax.swing.JLabel();
        cubesontablelabel = new javax.swing.JLabel();
        messages = new java.awt.TextArea();
        initcubes = new java.awt.TextField();
        kcubes = new java.awt.TextField();
        cubesontable = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MiniMax Game");

        Details1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Welcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Line.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Details2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Details3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Details4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Details5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Details5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        newgamebutton.setActionCommand("newgame");
        newgamebutton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        newgamebutton.setLabel("Νέο Παιχνίδι");
        newgamebutton.setName(""); // NOI18N
        newgamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgamebuttonActionPerformed(evt);
            }
        });

        initcubeslabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        initcubeslabel.setText("Αρχικό Πλήθος Κύβων");

        kcubeslabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kcubeslabel.setText("Πλήθος k");

        cubesontablelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cubesontablelabel.setText("Πλήθος κύβων στο τραπέζι");

        messages.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        initcubes.setEditable(false);
        initcubes.setEnabled(false);
        initcubes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        initcubes.setMinimumSize(new java.awt.Dimension(42, 40));

        kcubes.setEditable(false);
        kcubes.setEnabled(false);
        kcubes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kcubes.setMinimumSize(new java.awt.Dimension(42, 40));

        cubesontable.setEditable(false);
        cubesontable.setEnabled(false);
        cubesontable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cubesontable.setMinimumSize(new java.awt.Dimension(42, 40));
        cubesontable.setPreferredSize(new java.awt.Dimension(42, 20));
        cubesontable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubesontableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(initcubeslabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(initcubes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kcubeslabel)
                                .addGap(117, 117, 117)
                                .addComponent(cubesontablelabel)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(kcubes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cubesontable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initcubeslabel)
                    .addComponent(kcubeslabel)
                    .addComponent(cubesontablelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(initcubes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(kcubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cubesontable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messages, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                            .addComponent(Details1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Details2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Details3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Details4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Details5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newgamebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newgamebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newgamebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgamebuttonActionPerformed
        newgamebutton.setEnabled(false);                                // Απενεργοποίηση κουμπιού Νέου Παιχνιδιού
        boolean end = false;                                            // Αρχικοποίηση Μεταβλητών
        int val;                                                        // Αρχικοποίηση Μεταβλητών
        int k;                                                          // Αρχικοποίηση Μεταβλητών
        Messages("Δώσε τον αρχικό αριθμό των κύβων.");                  // Εμφάνιση μηνύματος.
        String test1 = JOptionPane.showInputDialog("Δώσε τον αρχικό αριθμό των κύβων: (Πρέπει να είναι μεγαλύτερος το 2)");
        val = Integer.parseInt(test1);
        int displayval=val;
        InitialCubes(displayval);                                       // Εμφάνιση αρχικού πλήθους κύβων
        CubesOnTable(displayval);                                       // Εμφάνιση τρέχοντος πλήθους κύβων στο τραπέζι
        Messages("Δώσε τον αριθμό που αντιστοιχεί στο k.");             // Εμφάνιση μηνύματος.
        String test2 = JOptionPane.showInputDialog("Δώσε τον αριθμό που αντιστοιχεί στο k: ");
        k = Integer.parseInt(test2);
        int displayk=k;
        kCubes(displayk);                                               // Εμφάνιση στην οθόνη του πλήθους k
        while (val<=k || k<0 || (k==1 || k==2 || k==0)){                // Έλεγχος αν η μεταβλητή k πληρεί τις προδιαγραφές του παιχνιδιού.
            String test3 = JOptionPane.showInputDialog("O αρχικός αριθμός πρέπει να πληρεί τις παρακάτω προδιαγραφές.\nΔεν πρέπει να είναι 1 ή 2, και πρέπει να είναι\nμικρότερος από τον αρχικό αριθμό κύβων.\nΔώσε έναν έγκυρο αριθμό που αντιστοιχεί στο k: ");
            k = Integer.parseInt(test3);
            displayk=k;
            kCubes(displayk);                                           // Εμφάνιση στην οθόνη του πλήθους k
        }
        boolean max = true;                                             // Αρχικοποίηση της μεταβλητής max που αντιστοιχεί.
                                                                        // στo επίπεδο του δένδρου αναζήτησης εαν είναι max ή min.
            while(!end) {                                               // Δομή επανάληψης για τον τερματισμό του παιχνιδιού (δεν υπάρχουν άλλοι κύβοι).
            int temp=val;                                               // Αρχικοποίηση της μεταβλητής temp.
            Minimax.State s = new Minimax.State(val, true, k);          // Δημιουργία αντικειμένου Minimax και αποστολή τιμών για έλεγχο.
            Minimax.State decision = Minimax.minimaxDecision(s);        // Υπολογισμός τις τιμής decision.
            val = decision.state;                                       // Επιστροφή της τιμής
            if (temp-val==1){
                Messages("Ο Max επέλεξε να μαζέψει "+(temp-val)+" κύβο.");  // Εμφάνιση του πλήθους των κύβων που τράβηξε ο Max
            }else
                Messages("Ο Max επέλεξε να μαζέψει "+(temp-val)+" κύβους.");// Εμφάνιση του πλήθους των κύβων που τράβηξε ο Max
            if (val==1){
                CubesOnTable(val);                                          // Εμφάνιση τρέχοντος πλήθους κύβων στο τραπέζι
            }else
                CubesOnTable(val);                                          // Εμφάνιση τρέχοντος πλήθους κύβων στο τραπέζι
            if(decision.isTerminal()){                                      // Έλεγχος αν δεν έχουν απομείνει άλλοι κύβοι.
                end = true;
                Messages("O παίκτης Max κέρδισε. Έχασες! Την επόμενη φορά ίσως κερδίσεις.\nΤέλος Παιχνιδιού. Προσπάθησε ξανά.");
                newgamebutton.setEnabled(true);                             // Ενεργοποίηση κουμπιού Νέου Παιχνιδιού
            }
            if (val!=0){
                String test4 = JOptionPane.showInputDialog("Πόσους κύβους θα πάρεις;");         // Μήνυμα για εισαγωγή πλήθους κύβων που θα αφαιρέσει ο παίκτης
                int nextval = Integer.parseInt(test4);
                while ((nextval!=1 && nextval!=2 && nextval!=k) || nextval>val){                // Έλεγχος εγκυρότητας της τιμής.
                    if (val==1){
                        Messages("Δεν μπορείς να πάρεις τόσους κύβους.\nΣτο τραπέζι υπάρχει μόνο ένας κύβος.\nΠρέπει να επιλέξεις έγκυρο πλήθος κύβων: 1");
                    }else if(val==2){
                        Messages("Δεν μπορείς να πάρεις τόσους κύβους.\nΣτο τραπέζι υπάρχουν μόνο δύο κύβος.\nΠρέπει να επιλέξεις έγκυρο πλήθος κύβων: 1 ή 2");
                    }
                    String test5 = JOptionPane.showInputDialog("Δεν μπορείς να πάρεις τόσους κύβους.\nΠρέπει να επιλέξεις έγκυρο πλήθος κύβων: 1 ή 2 ή "+k+".");
                    nextval = Integer.parseInt(test5);
                }            
                val=val-nextval;                                            // Υπολογισμός των κύβων που απομένουν.
                if (val==1){
                    CubesOnTable(val);                                      // Ενημέρωσης υπολοίπου κύβων
                    Messages("Επομένει "+val+" κύβος.");                    // Εμφάνιση μηνύματος
                }else
                    CubesOnTable(val);                                      // Ενημέρωσης υπολοίπου κύβων
                    Messages("Απομένουν "+val+" κύβοι.");                   // Εμφάνιση μηνύματος
                if(val==0){                                                 // Εαν ο χρήστης πήρε τον τελευταίο κύβο το παιχνίδι τελειώνει.
                    Messages("Συγχαρητήρια!!! Κέρδισες!!!\nΤέλος Παιχνιδιού. Προσπάθησε ξανά.");
                    newgamebutton.setEnabled(true);                         // Ενεργοποίηση κουμπιού Νέου Παιχνιδιού
                    break;
                }
            }
            max =!max;                                                      // Αλλαγή της τιμής του επιπέδου (max ή min) στη δομή ελέγχου
        }
    }//GEN-LAST:event_newgamebuttonActionPerformed

    private void cubesontableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubesontableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cubesontableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Details1;
    private javax.swing.JLabel Details2;
    private javax.swing.JLabel Details3;
    private javax.swing.JLabel Details4;
    private javax.swing.JLabel Details5;
    private javax.swing.JLabel Line;
    private javax.swing.JLabel Welcome;
    private java.awt.TextField cubesontable;
    private javax.swing.JLabel cubesontablelabel;
    private java.awt.TextField initcubes;
    private javax.swing.JLabel initcubeslabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField kcubes;
    private javax.swing.JLabel kcubeslabel;
    private java.awt.TextArea messages;
    private java.awt.Button newgamebutton;
    // End of variables declaration//GEN-END:variables

    public void Line() {                                    // Μέθοδος εμφάνισης γραμμής στο GUI
        Line.setText(String.valueOf("-----------------------------------------------------------------------------------------------------------------------------------------------------------------"));
    }
    
    public void Welcome() {                                 // Μέθοδος εμφάνισης μηνύματος
        Welcome.setText(String.valueOf("Καλώς ήρθες στο παιχνίδι που εφαρμόζει τον μηχανισμό MiniMax."));
    }
    
    public void Details1() {                                // Μέθοδος εμφάνισης μηνύματος
        Details1.setText(String.valueOf("Το παιχνίδι έχει ως στόχο την ανάδειξη νικητή μέσω της συγκέντρωσης κύβων."));
    }
    
    public void Details2() {                                // Μέθοδος εμφάνισης μηνύματος
        Details2.setText(String.valueOf("Ο χρήστης επιλέγει πόσοι κύβοι θα βρίσκονται αρχικά στο τραπέζι."));
    }
    
    public void Details3() {                                // Μέθοδος εμφάνισης μηνύματος
        Details3.setText(String.valueOf("Κάθε παίκτης μπορεί να παίρνει, όταν έρθει η σειρά του 1 ή 2 ή k αριθμό κύβων όπου το k ορίζεται επίσης στην αρχή."));
    }
    
    public void Details4() {                                // Μέθοδος εμφάνισης μηνύματος
        Details4.setText(String.valueOf("Νικητής είναι ο παίκτης που θα πάρει τον τελευταίο κύβο από το τραπέζι."));
    }
    
    public void Details5() {                                // Μέθοδος εμφάνισης μηνύματος
        Details5.setText(String.valueOf("Καλή επιτυχία!"));
    }
    
    public void Messages(String message) {                  // Μέθοδος εμφάνισης μηνύματος στο τμήμα μηνυμάτων του GUI
        messages.setText(String.valueOf(message));
    }
    
    public void InitialCubes(int initialcubes) {            // Μέθοδος ενημέρωσης αρχικού πλήθους κύβων
        initcubes.setText(String.valueOf(initialcubes));
    }
    
    public void kCubes(int displayk) {                      // Μέθοδος εμφάνισης αριθμού k
        kcubes.setText(String.valueOf(displayk));
    }
    
    public void CubesOnTable(int cubestable) {              // Μέθοδος εμφάνισης κύβων που απομένουν στο τραπέζι
        cubesontable.setText(String.valueOf(cubestable));
    }
}