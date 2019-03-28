package project;

import javax.swing.*;

//import clases.*;
import java.io.*;
import javax.*;

public class QuestionBankViewerFrame extends javax.swing.JFrame {
      ButtonGroup radioBtG = new ButtonGroup();
      ExamManager examM;
      String c;
   
public QuestionBankViewerFrame(String course){
    initComponents();
    setTitle(c+"Questions Bank");
    
        c = course;
        examM = new ExamManager(course);
    
        radioBtG.add(MCQb);
        radioBtG.add(trueFalseB);
        radioBtG.add(FillBlankb);
        choicesP.setVisible(false);
     
        addWindowListener(new java.awt.event.WindowAdapter(){
          
            public void windowClosing(java.awt.event.WindowEvent WindowEvent) {
                int answer = JOptionPane.showConfirmDialog(null, "Do you want to save the applied changes? ","Alert!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                if(answer == JOptionPane.YES_OPTION){
                    try{
                        examM.exportQBank();
                        JOptionPane.showMessageDialog(null, "Thank you for using the Exam Manager\nAll Questions have been saved", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error during saving the data", "Exam Manager", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Thank you for using the Exam Manager", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                
                System.exit(0);
                
            }
        }
        );
    

}
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        menu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        possibleG = new javax.swing.JTextField();
        QuesionT = new javax.swing.JTextField();
        QuesionI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MCQb = new javax.swing.JRadioButton();
        trueFalseB = new javax.swing.JRadioButton();
        FillBlankb = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        correctAnswer = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        choicesP = new javax.swing.JPanel();
        answer2 = new javax.swing.JTextField();
        Aswer1 = new javax.swing.JTextField();
        answer3 = new javax.swing.JTextField();
        asnwer4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ExamH = new javax.swing.JTextField();
        chapterName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numQ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        withAnswer = new javax.swing.JCheckBox();
        generateExam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chapterNameD = new javax.swing.JTextField();
        remove = new javax.swing.JButton();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Open"));
        jPanel6.setToolTipText("");
        jPanel6.setName(""); // NOI18N

        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jLabel10.setText("Pervious Courses");

        jLabel11.setText("New Course");

        jTextField9.setText("jTextField1");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton4.setText("Open Question Bank");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTextField4.setText("jTextField1");

        jLabel14.setText("2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add a New Qeustion"));

        jLabel1.setText("Question Text");

        jLabel2.setText("Question ID");

        jLabel3.setText("Possible Grades");

        QuesionT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuesionTActionPerformed(evt);
            }
        });

        jLabel4.setText("Choose the type of the Question");

        MCQb.setText("MCQ");
        MCQb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCQbActionPerformed(evt);
            }
        });

        trueFalseB.setText("True/False");
        trueFalseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueFalseBActionPerformed(evt);
            }
        });

        FillBlankb.setText("Fill Blank");
        FillBlankb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillBlankbActionPerformed(evt);
            }
        });

        jLabel5.setText("Correct Answer");

        correctAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswerActionPerformed(evt);
            }
        });

        Add.setText("Add Question");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        choicesP.setBorder(javax.swing.BorderFactory.createTitledBorder("Answers for MCQ"));

        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });

        Aswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aswer1ActionPerformed(evt);
            }
        });

        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });

        jLabel12.setText("1");

        jLabel13.setText("2");

        jLabel15.setText("3");

        jLabel16.setText("4");

        javax.swing.GroupLayout choicesPLayout = new javax.swing.GroupLayout(choicesP);
        choicesP.setLayout(choicesPLayout);
        choicesPLayout.setHorizontalGroup(
            choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choicesPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(choicesPLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Aswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(choicesPLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asnwer4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        choicesPLayout.setVerticalGroup(
            choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choicesPLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Aswer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(choicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asnwer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choicesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choicesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(possibleG, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuesionI, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuesionT, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(MCQb)
                                .addGap(18, 18, 18)
                                .addComponent(trueFalseB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FillBlankb)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuesionT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuesionI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(possibleG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MCQb)
                    .addComponent(trueFalseB)
                    .addComponent(FillBlankb))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Generarte Exam"));

        jLabel6.setText("Exam Header");

        jLabel7.setText("Number Of Question");

        jLabel8.setText("Chapter Name");

        withAnswer.setText("With Answers");
        withAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withAnswerActionPerformed(evt);
            }
        });

        generateExam.setText("Generate Exam");
        generateExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateExamActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chapterName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExamH, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numQ, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(withAnswer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generateExam))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ExamH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chapterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withAnswer)
                    .addComponent(generateExam))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Delete Chapter Question"));

        jLabel9.setText("Chapter Name");

        chapterNameD.setText("jTextField1");

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(42, 42, 42)
                .addComponent(chapterNameD, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(chapterNameD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuesionTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuesionTActionPerformed
       
    }//GEN-LAST:event_QuesionTActionPerformed

    private void FillBlankbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillBlankbActionPerformed
        choicesP.setVisible(false);
    }//GEN-LAST:event_FillBlankbActionPerformed

    private void correctAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswerActionPerformed
        
    }//GEN-LAST:event_correctAnswerActionPerformed

    private void MCQbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCQbActionPerformed
         choicesP.setVisible(true);
    }//GEN-LAST:event_MCQbActionPerformed

    private void withAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withAnswerActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Aswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Aswer1ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void trueFalseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueFalseBActionPerformed
choicesP.setVisible(false);
    }//GEN-LAST:event_trueFalseBActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (! validateField (QuesionT, "Question Text")) {
            return;
        }
        
        if (!validateField(QuesionI, "Question ID")) {
            return;
        }
        
        if (!validateField(possibleG, "Question Possible Grade")) {
            return;
        }
        
        if (!validateNumber(possibleG, "Question Possible Grade")) {
            
            return;
            
        }
        
        if (!(MCQb.isSelected() || trueFalseB.isSelected() || FillBlankb.isSelected())) {
            
            JOptionPane.showMessageDialog(this, "Question type field is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!validateField(correctAnswer, "Question Correct Answer")) {
            return;
        }
        
        if (MCQb.isSelected()) {
            
            if (!validateField(Aswer1, "First Choice")) {
                return;
            }
            
            if (!validateField(answer2, "Second Choice")) {
                return;
            }
            
            if (!validateField(answer3, "Third Choice")) {
                return;
            }
            
            if (!validateField(asnwer4 , "Fourth Choice")) {
                return;
            }

            /*Validate the correct answer --> should be integer [0-3] */
            if (!validateNumber(correctAnswer, "Question Correct Answer")) {
                
                return;
                
            }
            
            int correctAnswerIndex = Integer.parseInt(correctAnswer.getText());
            
            if (correctAnswerIndex < 0 || correctAnswerIndex > 3) {
                JOptionPane.showMessageDialog(this, "Answer for MCQ should be a number >=0 and < 3", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        }
        
        if (trueFalseB.isSelected()) {
            
            if (!(correctAnswer.getText().trim().equals("true") || correctAnswer.getText().trim().equals("false"))) {
                JOptionPane.showMessageDialog(this, "Answer should be 'true' or 'false' only", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        }

        /* All fields are validated now , so get values */
        String qText = QuesionT.getText().trim();
        String qID = QuesionT.getText().trim();
        double grade = Double.parseDouble(possibleG.getText().trim());
        
        boolean isAdded;
        
        if (MCQb.isSelected()) {
            
            String[] choices = {
                Aswer1.getText().trim(),
                answer2.getText().trim(),
                answer3.getText().trim(),
                asnwer4.getText().trim()};
            int correctAnswerIndex = Integer.parseInt(correctAnswer.getText());
            
            isAdded = examM.addNewQuestion(new MCQ(qText, qID, grade, correctAnswerIndex, choices));
            
        } else if (trueFalseB.isSelected()) {
            
            boolean answer = Boolean.parseBoolean(correctAnswer.getText().trim());
            isAdded = examM.addNewQuestion(new TrueFalseQ(qText, qID, grade, answer));
            
        } else {
            System.out.println("dd");
            isAdded = examM.addNewQuestion(new FillBlankQ(qText, qID, grade, correctAnswer.getText().trim()));
            System.out.println(isAdded);
        }
        
        if (isAdded) {
            JOptionPane.showMessageDialog(this, "New question has been added successfully !", "Add Question", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Oops !\nSomething went wrong \nMake sure the question\nis not exists.", "Add Question", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void generateExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateExamActionPerformed
     /*Validate all fields */
        if (!validateField(ExamH, "Exam Header")) {
            return;
        }
        
        if (!validateField(numQ, "Number of Questions")) {
            return;
        }
        
        if (!validateNumber(numQ, "Number of Questions")) {
            return;
        }
        
        int numOfQuestions;
        try {
            numOfQuestions = Integer.parseInt(numQ.getText().trim());
            
        } catch (NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(this, "Only Integers are allowed in Number of Questions field !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        /*Chapter name possaible to have empty value (random questions) */
        boolean withAnswer1 = withAnswer.isSelected();
        
        try {
            
            examM.generateExam(ExamH.getText(), numOfQuestions, chapterName.getText().trim(), withAnswer1);

            /*Read the generated exam */
            File file = new File(c + "Exam.txt");
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            jTextArea1.setText("");/*clear the text-area*/
            
            String st;
            while ((st = br.readLine()) != null) {
                jTextArea1.append(st + "\n");
            }
            
            JOptionPane.showMessageDialog(this, "Exam has been generated successfully !", "Generate Exam", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }        
        
    }//GEN-LAST:event_generateExamActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if (!validateField(chapterNameD, "Chapter Name")) {
            return;
        }
        
        examM.removeChapterQuestions(chapterNameD.getText());
        JOptionPane.showMessageDialog(this, chapterNameD.getText() + " questions removed successfully !\nMake sure to save your work.", "Questions Removed", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_removeActionPerformed

    
    public void clearFields() {
        
        QuesionT.setText("");
        QuesionI.setText("");
        possibleG.setText("");
        correctAnswer.setText("");
        Aswer1.setText("");
        answer2.setText("");
        answer3.setText("");
        asnwer4.setText("");
        
        radioBtG.clearSelection();
    }
    
    private boolean validateField(JTextField field, String fieldName) {
        
        if (field.getText().trim().equals("")) {

            //display an error message
            JOptionPane.showMessageDialog(this, fieldName + " field is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validateNumber(JTextField field, String fieldName) {
        
        String str = field.getText().trim();

        /*  check if it's a number or not 
         we will parse it , if it's threw an exception that means it's invalid number*/
        try {
            
            Double.parseDouble(str);//if it's not a valid number will throw an exception
            return true; // everything is ok 
        } catch (NumberFormatException e) {

            //display an error message
            JOptionPane.showMessageDialog(this, "Only Numbers are alowed in " + fieldName + " Field.", "Error", JOptionPane.ERROR_MESSAGE);
            
            return false;//terminate the process
        }
        
    }

 
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
            java.util.logging.Logger.getLogger(QuestionBankViewerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionBankViewerFrame(args[0]).setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Aswer1;
    private javax.swing.JTextField ExamH;
    private javax.swing.JRadioButton FillBlankb;
    private javax.swing.JRadioButton MCQb;
    private javax.swing.JTextField QuesionI;
    private javax.swing.JTextField QuesionT;
    private javax.swing.JTextField answer2;
    private javax.swing.JTextField answer3;
    private javax.swing.JTextField asnwer4;
    private javax.swing.JTextField chapterName;
    private javax.swing.JTextField chapterNameD;
    private javax.swing.JPanel choicesP;
    private javax.swing.JTextField correctAnswer;
    private javax.swing.JButton generateExam;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JTextField numQ;
    private javax.swing.JTextField possibleG;
    private javax.swing.JButton remove;
    private javax.swing.JRadioButton trueFalseB;
    private javax.swing.JCheckBox withAnswer;
    // End of variables declaration//GEN-END:variables

   
}
