/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Dimension;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.Rectangle;
/*   7:    */ import java.awt.event.KeyEvent;
/*   8:    */ import java.awt.event.KeyListener;
/*  10:    */ import javax.swing.ImageIcon;
/*  11:    */ import javax.swing.JFrame;
/*  12:    */ import javax.swing.JLabel;
/*  13:    */ import javax.swing.JOptionPane;
/*  14:    */ import javax.swing.JPanel;
/*  15:    */ import javax.swing.JTextField;
/*  16:    */ 
/*  17:    */ public class Copy_2_of_Counter
/*  18:    */   extends JFrame
/*  19:    */ {
    private int j=0;
/*  20:    */   private int num;
/*  21:    */   private JTextField[] str2;
/*  22:    */   private JLabel[] str;
/*  23:    */   private JPanel bg;
/*  24:    */   private double[] result;
/*  25:    */   private JTextField content;
/*  26:    */   
/*  27:    */
private Copy_2_of_Counter(int n)
/*  28:    */   {
/*  29: 26 */     this.num = n;
/*  30: 27 */     this.str2 = new JTextField[n];
/*  31: 28 */     this.str = new JLabel[n];
/*  32: 29 */     this.result = new double[n];
/*  33: 30 */     this.bg = new JPanel();
/*  34: 31 */     this.content = new JTextField();
/*  35:    */     
/*  36: 33 */     initialize();
/*  37:    */   }
/*  38:    */   
/*  39:    */
private void initialize()
/*  40:    */   {
/*  41: 38 */     Font f = new Font("宋体", Font.BOLD, 50);
/*  42: 39 */     this.content.setBounds(350, 200, 300, 300);
/*  43: 40 */     this.content.setForeground(Color.black);
/*  44: 41 */     this.content.setEditable(false);
/*  45: 42 */     this.content.setFont(new Font("宋体", Font.BOLD, 100));
/*  46:    */     
/*  47: 44 */     setSize(1024, 710);
/*  48: 45 */     setResizable(false);
/*  49: 46 */     setTitle("");
/*  50: 47 */     ImageIcon img = new ImageIcon("101.JPG");
/*  51: 48 */     JLabel background = new JLabel(img);
/*  52: 49 */     background.setSize(new Dimension(1024, 710));
/*  53: 50 */     background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
/*  54: 51 */     setContentPane(this.bg);
/*  55: 52 */     this.bg.setLayout(null);
/*  56:    */     
/*  57:    */ 
/*  58: 55 */     this.bg.setLayout(null);
/*  59: 56 */     this.bg.add(this.content);
/*  60: 57 */     for (int i = 0; i < this.num; i++)
/*  61:    */     {
/*  62: 58 */       this.str[i] = new JLabel();
/*  63: 59 */       this.str2[i] = new JTextField();
/*  64:    */       
/*  65: 61 */       this.str[i].setBounds(new Rectangle(400, 600, 400, 50));
/*  66: 62 */       this.str2[i].setBounds(new Rectangle(750, 600, 150, 50));
/*  67:    */       
/*  68: 64 */       this.str[i].setText(i + 1 + "号评委打分：");
/*  69: 65 */       this.str[i].setForeground(Color.BLUE);
/*  70: 66 */       this.str[i].setFont(f);
/*  71: 67 */       this.str2[i].setText(String.valueOf(""));
/*  72: 68 */       this.str2[i].setForeground(Color.blue);
/*  73: 69 */       this.str2[i].setBackground(Color.WHITE);
/*  74: 70 */       this.str2[i].setFont(f);
/*  75: 71 */       this.str[i].setVisible(false);
/*  76: 72 */       this.str2[i].setVisible(false);
/*  77:    */       
/*  78: 74 */       this.bg.add(this.str[i]);
/*  79: 75 */       this.bg.add(this.str2[i]);
/*  80:    */     }
/*  81: 77 */     process(0);
/*  82: 78 */     this.bg.add(background, new Integer(-2147483648));
/*  83:    */   }
/*  84:    */   
/*  85:    */   private void process(int tmp)
/*  86:    */   {
/*  87: 82 */     final int[] i = new int[1];
/*  88: 83 */     if (tmp < this.num - 1) {
/*  89: 83 */       process(tmp + 1);
/*  90:    */     }
/*  91: 84 */     i[0] = tmp;
/*  92: 85 */     this.str[i[0]].setVisible(true);
/*  93: 86 */     this.str2[i[0]].setVisible(true);
/*  94:    */     
/*  95: 88 */     this.content.setText("");
/*  96: 89 */     this.str2[i[0]].addKeyListener(new KeyListener()
/*  97:    */     {
/*  98:    */       public void keyPressed(KeyEvent e)
/*  99:    */       {
/* 100: 94 */         if (e.getKeyCode() == 10)
/* 101:    */         {
/* 102: 95 */           String number = Copy_2_of_Counter.this.str2[i[0]].getText();
/* 103: 97 */           for (; j < number.length(); j++) {
/* 104: 98 */             if ((number.charAt(j) < '0') || 
/* 105: 99 */               (number.charAt(j) > '9'))
/* 106:    */             {
/* 107:102 */               JOptionPane.showMessageDialog(null, 
/* 108:103 */                 "输入不合法,,请输入大于4且小于50的整数");
/* 109:104 */               break;
/* 110:    */             }
/* 111:    */           }
/* 112:107 */           if (number.length() == 0)
/* 113:    */           {
/* 114:108 */             JOptionPane.showMessageDialog(null, "输入不能为空");
/* 115:    */           }
/* 116:109 */           else if (j>= number.length())
/* 117:    */           {
/* 118:110 */             Double n = Double.parseDouble(number);
/* 119:111 */             Copy_2_of_Counter.this.content.setText(n.toString());
/* 120:112 */             Copy_2_of_Counter.this.result[i[0]] = n;
/* 121:113 */             Copy_2_of_Counter.this.str[i[0]].setVisible(false);
/* 122:114 */             Copy_2_of_Counter.this.str2[i[0]].setVisible(false);
/* 123:115 */             System.out.println(n);
/* 124:    */           }
/* 125:    */         }
/* 126:    */       }
/* 127:    */       
/* 128:    */       public void keyReleased(KeyEvent e) {}
/* 129:    */       
/* 130:    */       public void keyTyped(KeyEvent e) {}
/* 131:    */     });
/* 132:    */   }
/* 133:    */   
/* 134:    */   public static void main(String[] args)
/* 135:    */   {
/* 136:133 */     Copy_2_of_Counter c = new Copy_2_of_Counter(4);
/* 137:134 */     c.setDefaultCloseOperation(3);
/* 138:135 */     c.setVisible(true);
/* 139:    */   }
/* 140:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.Copy_2_of_Counter

 * JD-Core Version:    0.7.0.1

 */