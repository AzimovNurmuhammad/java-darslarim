package com.company.Grafik_Muhit.Asosiy_Oynani_Yaratish;

import java.awt.FlowLayout;
//FlowLayout bu berilayotgan kompanentlardi chapdan o'nga qarab tartiblaydi
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Oyna_Methods extends JFrame{
    private JLabel matn;

    public Oyna_Methods(){
        super("Oyna sarlavhasi");
        /*
        kalkulatorga kirganimizda tepa chapda kalkulator degan suz buladi shuni oynaga yozish uchun
        " super " metod ichiga yoziladi yaratadigan dasturingiz nomini yozasiz yoki hohlagan narsani yozasiz.
         */

        setLayout(new FlowLayout());
        /*
setLayout(new FlowLayout()); bu quyiladigan buttinlarni o'ng tarafdan saralaydi
         */

        matn = new JLabel("Bu men yozgan matn.");
        matn.setToolTipText("Kursor matn ustida...");
        /*
        matn.setToolTipText("Kursor matn ustida...");   bu sichonchani qaysidir buttinga etganingizda  shu haqida
        qisqacha ma'lumot beradi.
        M. sichqonchani ishlatayotgan IntelejIDE dasturini o'ng tepa purchakdagi x buttiniga etsak exit
        degan yozuv kurinadi
         */
        add(matn);
// add(matn);    matnni JFramega qushish uchun ishlatdik matn oldin JLabel edi

    }
}
