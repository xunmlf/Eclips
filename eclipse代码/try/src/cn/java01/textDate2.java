package cn.java01;
/**
 * ���ӻ��ճ�������
 * @author lenovo
 *
 */

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class textDate2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("���������ڣ���ʽΪ��2010-3-3����");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine(); // 2010-3-1
        
        // ��������ַ���ת����������
        System.out.println("���ո�����������ǣ�" + dateString);
        String[] str = dateString.split("-");
        int year = Integer.parseInt(str[0]);
        int month = new Integer(str[1]);
        int day = new Integer(str[2]);
        Calendar c = new GregorianCalendar(year, month - 1, day); // Month:0-11
        
        // ����Լ�������һ�ַ�ʽ�����ַ���ͨ��SImpleDateFormatת����Date����
        //�ٽ�Date����ת����������
        // SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Date date = sdfDateFormat.parse(dateString);
        // Calendar c = new GregorianCalendar();
        // c.setTime(date);
        // int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, 1);
        int dow = c.get(Calendar.DAY_OF_WEEK); // week:1-7 ��һ����������
        System.out.println("��\tһ\t��\t��\t��\t��\t��");
        for (int i = 0; i < dow - 1; i++) {
            System.out.print("\t");
        }
        int maxDate = c.getActualMaximum(Calendar.DATE);
        
        
        // System.out.println("maxDate:"+maxDate);
        for (int i = 1; i <= maxDate; i++) {
            StringBuilder sBuilder = new StringBuilder();
            if (c.get(Calendar.DATE) == day) {
                sBuilder.append(c.get(Calendar.DATE) + "*\t");
            } else {
                sBuilder.append(c.get(Calendar.DATE) + "\t");
            }
            System.out.print(sBuilder);
            
            
            // System.out.print(c.get(Calendar.DATE)+
            //                ((c.get(Calendar.DATE)==day)?"*":"")+"\t");
 
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.print("\n");
            }
            c.add(Calendar.DATE, 1);
        }
    }
}
