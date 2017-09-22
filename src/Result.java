/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Dimension;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.Rectangle;
/*   9:    */ import java.text.DecimalFormat;
/*  10:    */ import javax.swing.BorderFactory;
/*  11:    */ import javax.swing.ImageIcon;
/*  12:    */ import javax.swing.JButton;
/*  13:    */ import javax.swing.JFrame;
/*  14:    */ import javax.swing.JLabel;
/*  15:    */ import javax.swing.JScrollPane;
/*  16:    */ import javax.swing.JTextField;
/*  17:    */ 
/*  18:    */ public class Result
/*  19:    */   extends JFrame
/*  20:    */ {
    /*  22:    */   private JTextField[] label;
/*  23: 27 */   private JButton jButton_max = null;
/*  24: 28 */   private JButton jButton_min = null;
/*  25: 29 */   private JButton btn_min = null;
/*  26: 30 */   private JButton btn_max = null;
/*  27: 31 */   private JButton btn_agin = null;
/*  28:    */   private double[] temp;
/*  29:    */   private int count;
/*  30: 34 */   private JButton btn = null;
    /*  42:    */   private JTextField result;
/*  43: 47 */   private int num_min = 0;
/*  44: 48 */   private int num_max = 0;
/*  45:    */   
/*  46:    */
private Result() {}
/*  47:    */   
/*  48:    */    Result(double[] result, int num)
/*  49:    */   {
/*  50: 54 */     this.temp = result;
/*  51: 55 */     this.count = num;
/*  52:    */     
/*  53: 57 */     Font f = new Font("宋体", Font.BOLD, 40);
/*  54: 58 */
    JScrollPane panel = new JScrollPane();
/*  55:    */     
/*  56: 60 */     setSize(1024, 768);
/*  57:    */     
/*  58: 62 */     setTitle("");
/*  59: 63 */     setDefaultCloseOperation(3);
/*  60: 64 */     ImageIcon img = new ImageIcon("bg.JPG");
/*  61: 65 */     JLabel background = new JLabel(img);
/*  62: 66 */     background.setSize(new Dimension(1024, 710));
/*  63: 67 */     background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
/*  64: 68 */     setContentPane(panel);
/*  65: 69 */     panel.setLayout(null);
/*  66: 70 */     panel.add(background, new Integer(-2147483648));
/*  67:    */     
/*  68: 72 */
    JLabel p1 = new JLabel("结");
/*  69: 73 */     p1.setBounds(50, 20, 60, 50);
/*  70: 74 */     p1.setFont(new Font("宋体", Font.BOLD, 50));
/*  71: 75 */     p1.setForeground(Color.black);
/*  72: 76 */     panel.add(p1);
/*  73: 77 */
    JLabel p2 = new JLabel("果");
/*  74: 78 */     p2.setBounds(50, 70, 60, 50);
/*  75: 79 */     p2.setFont(new Font("宋体", Font.BOLD, 50));
/*  76: 80 */     p2.setForeground(Color.black);
/*  77: 81 */     panel.add(p2);
/*  78: 82 */
    JLabel p3 = new JLabel("统");
/*  79: 83 */     p3.setBounds(50, 120, 60, 50);
/*  80: 84 */     p3.setFont(new Font("宋体", Font.BOLD, 50));
/*  81: 85 */     p3.setForeground(Color.black);
/*  82: 86 */     panel.add(p3);
/*  83: 87 */
    JLabel p4 = new JLabel("计");
/*  84: 88 */     p4.setBounds(50, 170, 60, 50);
/*  85: 89 */     p4.setFont(new Font("宋体", Font.BOLD, 50));
/*  86: 90 */     p4.setForeground(Color.black);
/*  87: 91 */     panel.add(p4);
/*  88:    */     
/*  89: 93 */
    JLabel max = new JLabel("最高分");
/*  90: 94 */     max.setBounds(130, 50, 200, 50);
/*  91: 95 */     max.setFont(f);
/*  92: 96 */     max.setForeground(Color.black);
/*  93: 97 */     panel.add(max);
/*  94: 98 */
    JTextField tmax = new JTextField();
/*  95: 99 */     tmax.setBounds(270, 50, 100, 50);
/*  96:100 */     tmax.setFont(f);
/*  97:101 */     tmax.setForeground(Color.red);
/*  98:102 */     tmax.setBackground(Color.white);
/*  99:103 */     tmax.setEditable(false);
/* 100:104 */     tmax.setHorizontalAlignment(0);
/* 101:105 */     tmax.setBorder(BorderFactory.createEmptyBorder());
/* 102:106 */     panel.add(tmax);
/* 103:    */     
/* 104:108 */
    JLabel min = new JLabel("最低分");
/* 105:109 */     min.setBounds(130, 140, 200, 50);
/* 106:110 */     min.setFont(f);
/* 107:111 */     min.setForeground(Color.black);
/* 108:112 */     panel.add(min);
/* 109:113 */
    JTextField tmin = new JTextField();
/* 110:114 */     tmin.setBounds(270, 140, 100, 50);
/* 111:115 */     tmin.setFont(f);
/* 112:116 */     tmin.setForeground(Color.red);
/* 113:117 */     tmin.setBackground(Color.white);
/* 114:118 */     tmin.setEditable(false);
/* 115:119 */     tmin.setHorizontalAlignment(0);
/* 116:120 */     tmin.setBorder(BorderFactory.createEmptyBorder());
/* 117:121 */     panel.add(tmin);
/* 118:    */     
/* 119:123 */
    JLabel lresult1 = new JLabel("平");
/* 120:124 */     lresult1.setBounds(400, 50, 50, 50);
/* 121:125 */     lresult1.setFont(f);
/* 122:126 */     lresult1.setForeground(Color.black);
/* 123:127 */     panel.add(lresult1);
/* 124:128 */
    JLabel lresult2 = new JLabel("均");
/* 125:129 */     lresult2.setBounds(400, 100, 50, 50);
/* 126:130 */     lresult2.setFont(f);
/* 127:131 */     lresult2.setForeground(Color.black);
/* 128:132 */     panel.add(lresult2);
/* 129:133 */
    JLabel lresult3 = new JLabel("分");
/* 130:134 */     lresult3.setBounds(400, 150, 50, 50);
/* 131:135 */     lresult3.setFont(f);
/* 132:136 */     lresult3.setForeground(Color.black);
/* 133:137 */     panel.add(lresult3);
/* 134:138 */     this.result = new JTextField();
/* 135:139 */     this.result.setBounds(500, 50, 440, 150);
/* 136:140 */     this.result.setFont(new Font("宋体", Font.BOLD, 110));
/* 137:141 */     this.result.setForeground(Color.red);
/* 138:142 */     this.result.setBackground(Color.white);
/* 139:143 */     this.result.setEditable(false);
/* 140:144 */     this.result.setHorizontalAlignment(0);
/* 141:145 */     this.result.setBorder(BorderFactory.createEmptyBorder());
/* 142:146 */     panel.add(this.result);
/* 143:    */     
/* 144:148 */     this.btn_max = new JButton();
/* 145:149 */     this.btn_max.setBounds(new Rectangle(670, 650, 270, 50));
/* 146:150 */     this.btn_max.setText("显示最高分");
/* 147:151 */     this.btn_max.setForeground(Color.red);
/* 148:152 */     this.btn_max.setBorder(BorderFactory.createRaisedBevelBorder());
/* 149:153 */     this.btn_max.setFont(new Font("宋体", Font.BOLD, 30));
/* 150:154 */     this.btn_max.setContentAreaFilled(false);
/* 151:155 */     /* 152:    *//* 153:    *//* 154:    *//* 168:175 */
    this.btn_max.addActionListener(e -> {
    /* 155:161 */         double tmp = Result.this.temp[0];
    /* 156:163 */         for (int i = 1; i < Result.this.count; i++) {
    /* 157:164 */           if (tmp < Result.this.temp[i])
    /* 158:    */           {
    /* 159:165 */             tmp = Result.this.temp[i];
    /* 160:166 */             Result.this.num_max = i;
    /* 161:    */           }
    /* 162:    */         }
    /* 163:170 */         tmax.setText(String.valueOf(Result.this.temp[Result.this.num_max]));
    /* 164:    */
    /* 165:172 */         Result.this.btn_max.setVisible(false);
    /* 166:173 */         Result.this.jButton_max.setVisible(true);
    /* 167:    */       });
/* 169:176 */     panel.add(this.btn_max);
/* 170:    */     
/* 171:178 */     this.jButton_max = new JButton();
/* 172:179 */     this.jButton_max.setBounds(new Rectangle(670, 650, 270, 50));
/* 173:180 */     this.jButton_max.setText("去掉最高分");
/* 174:181 */     this.jButton_max.setForeground(Color.red);
/* 175:182 */     this.jButton_max.setBorder(BorderFactory.createRaisedBevelBorder());
/* 176:183 */     this.jButton_max.setFont(new Font("宋体", Font.BOLD, 30));
/* 177:184 */     this.jButton_max.setContentAreaFilled(false);
/* 178:185 */     this.jButton_max.setVisible(false);
/* 179:186 */     /* 180:    *//* 181:    *//* 182:    *//* 189:198 */
    this.jButton_max.addActionListener(e -> {
    /* 183:191 */         Result.this.label[Result.this.num_max].setBackground(Color.yellow);
    /* 184:    */
    /* 185:193 */         Result.this.label[Result.this.num_max].setForeground(Color.black);
    /* 186:194 */         Result.this.jButton_max.setVisible(false);
    /* 187:195 */         Result.this.btn_min.setVisible(true);
    /* 188:    */       });
/* 190:199 */     panel.add(this.jButton_max);
/* 191:    */     
/* 192:201 */     this.btn_min = new JButton();
/* 193:202 */     this.btn_min.setBounds(new Rectangle(670, 650, 270, 50));
/* 194:203 */     this.btn_min.setText("显示最低分");
/* 195:204 */     this.btn_min.setForeground(Color.red);
/* 196:205 */     this.btn_min.setBorder(BorderFactory.createRaisedBevelBorder());
/* 197:206 */     this.btn_min.setFont(new Font("宋体", Font.BOLD, 30));
/* 198:207 */     this.btn_min.setContentAreaFilled(false);
/* 199:208 */     this.btn_min.setVisible(false);
/* 200:209 */     /* 201:    *//* 202:    *//* 203:    *//* 221:234 */
    this.btn_min.addActionListener(e -> {
    /* 204:215 */         double tmp = Result.this.temp[0];
    /* 205:216 */         if (Result.this.num_max == Result.this.num_min)
    /* 206:    */         {
    /* 207:217 */           tmp = Result.this.temp[1];
    /* 208:218 */           Result.this.num_min = 1;
    /* 209:    */         }
    /* 210:221 */         for (int i = 1; i < Result.this.count; i++) {
    /* 211:222 */           if (tmp > Result.this.temp[i])
    /* 212:    */           {
    /* 213:223 */             tmp = Result.this.temp[i];
    /* 214:224 */             Result.this.num_min = i;
    /* 215:    */           }
    /* 216:    */         }
    /* 217:229 */         tmin.setText(String.valueOf(Result.this.temp[Result.this.num_min]));
    /* 218:230 */         Result.this.btn_min.setVisible(false);
    /* 219:231 */         Result.this.jButton_min.setVisible(true);
    /* 220:    */       });
/* 222:235 */     panel.add(this.btn_min);
/* 223:    */     
/* 224:237 */     this.jButton_min = new JButton();
/* 225:238 */     this.jButton_min.setBounds(new Rectangle(670, 650, 270, 50));
/* 226:239 */     this.jButton_min.setText("去掉最低分");
/* 227:240 */     this.jButton_min.setForeground(Color.red);
/* 228:241 */     this.jButton_min.setBorder(BorderFactory.createRaisedBevelBorder());
/* 229:242 */     this.jButton_min.setFont(new Font("宋体", Font.BOLD, 30));
/* 230:243 */     this.jButton_min.setContentAreaFilled(false);
/* 231:244 */     this.jButton_min.setVisible(false);
/* 232:245 */     /* 233:    *//* 234:    *//* 235:    *//* 241:258 */
    this.jButton_min.addActionListener(e -> {
    /* 236:252 */         Result.this.label[Result.this.num_min].setForeground(Color.black);
    /* 237:253 */         Result.this.label[Result.this.num_min].setBackground(Color.yellow);
    /* 238:254 */         Result.this.jButton_min.setVisible(false);
    /* 239:255 */         Result.this.btn.setVisible(true);
    /* 240:    */       });
/* 242:259 */     panel.add(this.jButton_min);
/* 243:    */     
/* 244:261 */     this.btn = new JButton();
/* 245:262 */     this.btn.setBounds(new Rectangle(670, 650, 270, 50));
/* 246:263 */     this.btn.setText("最后得分");
/* 247:264 */     this.btn.setForeground(Color.red);
/* 248:265 */     this.btn.setBorder(BorderFactory.createRaisedBevelBorder());
/* 249:266 */     this.btn.setFont(new Font("宋体", Font.BOLD, 30));
/* 250:267 */     this.btn.setContentAreaFilled(false);
/* 251:268 */     this.btn.setVisible(false);
/* 252:269 */     /* 253:    *//* 254:    *//* 255:    *//* 276:299 */
    this.btn.addActionListener(e -> {
    /* 256:275 */         double sum = 0.0D;
    /* 257:276 */         int m = 0;
    /* 258:277 */         for (int i = 0; i < Result.this.count; i++) {
    /* 259:279 */           if ((i != Result.this.num_min) && (i != Result.this.num_max))
    /* 260:    */           {
    /* 261:280 */             m++;
    /* 262:281 */             sum += Result.this.temp[i];
    /* 263:    */           }
    /* 264:    */         }
    /* 265:287 */         sum /= m;
    /* 266:288 */         DecimalFormat df = new DecimalFormat("#.00");
    /* 267:    */
    /* 268:    */
    /* 269:291 */         Result.this.result.setText(df.format(sum));
    /* 270:    */
    /* 271:    */
    /* 272:    */
    /* 273:295 */         Result.this.btn.setVisible(false);
    /* 274:296 */         Result.this.btn_agin.setVisible(true);
    /* 275:    */       });
/* 277:300 */     panel.add(this.btn);
/* 278:    */     
/* 279:    */ 
/* 280:303 */     this.btn_agin = new JButton();
/* 281:304 */     this.btn_agin.setBounds(new Rectangle(670, 650, 270, 50));
/* 282:305 */     this.btn_agin.setText("重新开始");
/* 283:306 */     this.btn_agin.setBorder(BorderFactory.createRaisedBevelBorder());
/* 284:307 */     this.btn_agin.setForeground(Color.red);
/* 285:308 */     this.btn_agin.setFont(new Font("宋体", Font.BOLD, 30));
/* 286:309 */     this.btn_agin.setContentAreaFilled(false);
/* 287:310 */     this.btn_agin.setVisible(false);
/* 288:311 */     /* 289:    *//* 290:    *//* 291:    *//* 297:323 */
    this.btn_agin.addActionListener(e -> {
    /* 292:316 */         Counter counter = new Counter(Result.this.count);
    /* 293:317 */         counter.setSize(1024, 768);
    /* 294:318 */         counter.setVisible(true);
    /* 295:319 */         Result.this.setVisible(false);
    /* 296:    */       });
/* 298:324 */     panel.add(this.btn_agin);
/* 299:    */     
/* 300:326 */     this.label = new JTextField[num];
/* 301:327 */     int y = 230;
/* 302:328 */     int x = 60;
/* 303:329 */     if (num / 3 == 1)
/* 304:    */     {
/* 305:330 */       y += 120;
/* 306:331 */       x = 120;
/* 307:    */     }
/* 308:332 */     else if (num / 3 == 2)
/* 309:    */     {
/* 310:333 */       y += 90;
/* 311:334 */       x = 110;
/* 312:    */     }
/* 313:335 */     else if (num / 3 == 3)
/* 314:    */     {
/* 315:336 */       y += 60;
/* 316:337 */       x = 100;
/* 317:    */     }
/* 318:338 */     else if (num / 3 == 4)
/* 319:    */     {
/* 320:339 */       y += 40;
/* 321:340 */       x = 90;
/* 322:    */     }
/* 323:341 */     else if (num / 3 == 5)
/* 324:    */     {
/* 325:342 */       y += 30;
/* 326:343 */       x = 80;
/* 327:    */     }
/* 328:345 */     for (int i = 0; i < num; i++)
/* 329:    */     {
/* 330:346 */       this.label[i] = new JTextField();
/* 331:347 */       this.label[i].setEditable(false);
/* 332:348 */       this.label[i].setBackground(Color.white);
/* 333:349 */       this.label[i].setBorder(BorderFactory.createEmptyBorder());
/* 334:350 */       if (i % 3 == 0)
/* 335:    */       {
/* 336:351 */         this.label[i].setBounds(new Rectangle(50, y, 270, 50));
/* 337:    */       }
/* 338:353 */       else if (i % 3 == 1)
/* 339:    */       {
/* 340:354 */         this.label[i].setBounds(new Rectangle(360, y, 270, 50));
/* 341:    */       }
/* 342:355 */       else if (i % 3 == 2)
/* 343:    */       {
/* 344:356 */         this.label[i].setBounds(new Rectangle(670, y, 270, 50));
/* 345:357 */
            y = y + x;
/* 346:    */       }
/* 347:364 */       this.label[i].setText(i + 1 + "号评委:" + result[i]);
/* 348:365 */       this.label[i].setForeground(Color.BLUE);
/* 349:366 */       this.label[i].setHorizontalAlignment(0);
/* 350:367 */       this.label[i].setFont(new Font("宋体", Font.BOLD, 35));
/* 351:368 */       panel.add(this.label[i]);
/* 352:    */     }
/* 353:393 */     panel.add(background, new Integer(-2147483648));
/* 354:    */   }
/* 355:    */   
/* 356:    */   public static void main(String[] args)
/* 357:    */   {
/* 358:400 */     Result c = new Result();
/* 359:401 */     c.setDefaultCloseOperation(3);
/* 360:402 */     c.setVisible(true);
/* 361:    */   }
/* 362:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.Result

 * JD-Core Version:    0.7.0.1

 */