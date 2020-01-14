/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranduykhanh
 */
public class MultipleChoice extends CauHoi {

    public MultipleChoice(String noiDung, List<PhuongAn> phuongAn, MucDo mucDo, String danhMuc) {
        super(noiDung, phuongAn, mucDo, danhMuc);
    }

    @Override
    public void luyenTap(List<CauHoi> ds, Scanner scanner) {
        System.out.print("Nhập số câu hỏi muốn luyện tập : ");
        int soCauHoi = scanner.nextInt();
        
        if (soCauHoi > ds.size()) {
            System.out.print("Số câu hỏi vượt quá danh sách câu hỏi");
            return;
        }
        
        for (CauHoi c: ds) {
            System.out.println(c);
            System.out.print("Trả lời của bạn: ");
            String da = scanner.next();
            
            if (c.ktDapAn(da) == true)
                System.out.println("CHÍNH XÁC!!!");
            else
                System.out.println("SAI RỒI!!!");
        }
    }
}
