package exercise.Ch2;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //정적 초기화 블록으로 초기화 한 정적 변수 ArrayList를 가져오기.
        for (int i = 0; i < CreditCardForm.expirationYear.size(); i++){
            System.out.println(CreditCardForm.expirationYear.get(i));
        }

        //정적 메서드를 객체로 사용
        CreditCardForm creditCardForm = new CreditCardForm();

        LocalDate.now();
        System.out.println(creditCardForm.getString());
        LocalDate localDate = LocalDate.of(111,11,1);
        localDate.now();

        List a = Collections.emptyList();
        NumberFormat.getCurrencyInstance();

        PackageAccessor packageAccessor = new PackageAccessor();
        System.out.println(packageAccessor.a);

        //정적 중첩 클래스를 공개로 만들 경우.

        Invoice myInvoice = new Invoice();
        Invoice.Item newItem = new Invoice.Item("Toaster", 2, 19.95);
        myInvoice.add(newItem);
        myInvoice.add(new Invoice.Item("Toaster2", 3, 19.95));
        myInvoice.add(new Invoice.Item("Toaster5", 4, 19.95));
        myInvoice.print();




    }
}
