/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Dimension;
/*   4:    */ import java.awt.Toolkit;
/*   5:    */ import javax.swing.JFrame;
/*   6:    */ 
/*   7:    */ class Center
/*   8:    */ {
/*   9:    */   public static void centerFrame(JFrame frame)
/*  10:    */   {
/*  11:197 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/*  12:198 */     Dimension frameSize = frame.getSize();
/*  13:199 */     if (frameSize.height > screenSize.height) {
/*  14:200 */       frameSize.height = screenSize.height;
/*  15:    */     }
/*  16:202 */     if (frameSize.width > screenSize.width) {
/*  17:203 */       frameSize.width = screenSize.width;
/*  18:    */     }
/*  19:205 */     frame.setLocation((screenSize.width - frameSize.width) / 2, 
/*  20:206 */       (screenSize.height - frameSize.height) / 2);
/*  21:    */   }
/*  22:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.Center

 * JD-Core Version:    0.7.0.1

 */