import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel Calculadora;
    private JTextField txtDisplay;
    private JButton bclr;
    private JButton bmul;
    private JButton bsub;
    private JButton badd;
    private JButton beq;
    private JButton bdel;
    private JButton b7;
    private JButton b4;
    private JButton b1;
    private JButton b00;
    private JButton bdiv;
    private JButton b8;
    private JButton b5;
    private JButton b2;
    private JButton b0;
    private JButton bneg;
    private JButton b9;
    private JButton b6;
    private JButton b3;
    private JButton bdec;

    static double a, b, resultado;
    static String operador;

    public Calculadora() {
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b9.getText());
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b8.getText());
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b7.getText());
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b6.getText());
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b5.getText());
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b4.getText());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b3.getText());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b2.getText());
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b1.getText());
            }
        });

        b00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b00.getText());
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + b0.getText());
            }
        });

        bdec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + bdec.getText());
                }
            }
        });

        bclr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });

        bdel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (!txtDisplay.getText().isEmpty()) {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });

        bneg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    if (txtDisplay.getText().contains(".")) {
                        double pm = Double.parseDouble(txtDisplay.getText());
                        pm = pm * -1;
                        txtDisplay.setText(String.valueOf(pm));
                    } else {
                        long pm = Long.parseLong(txtDisplay.getText());
                        pm = pm * -1;
                        txtDisplay.setText(String.valueOf(pm));
                    }
                }
            }
        });

        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(txtDisplay.getText());
                    operador = "/";
                    txtDisplay.setText("");
                } catch (NumberFormatException ex) {
                    txtDisplay.setText("Erro");
                }
            }
        });

        bmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(txtDisplay.getText());
                    operador = "*";
                    txtDisplay.setText("");
                } catch (NumberFormatException ex) {
                    txtDisplay.setText("Erro");
                }
            }
        });

        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(txtDisplay.getText());
                    operador = "-";
                    txtDisplay.setText("");
                } catch (NumberFormatException ex) {
                    txtDisplay.setText("Erro");
                }
            }
        });

        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(txtDisplay.getText());
                    operador = "+";
                    txtDisplay.setText("");
                } catch (NumberFormatException ex) {
                    txtDisplay.setText("Erro");
                }
            }
        });

        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    b = Double.parseDouble(txtDisplay.getText());
                    switch (operador) {
                        case "+":
                            resultado = a + b;
                            break;
                        case "-":
                            resultado = a - b;
                            break;
                        case "*":
                            resultado = a * b;
                            break;
                        case "/":
                            if (b != 0) {
                                resultado = a / b;
                            } else {
                                txtDisplay.setText("Erro");
                                return;
                            }
                            break;
                    }
                    txtDisplay.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    txtDisplay.setText("Erro");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
