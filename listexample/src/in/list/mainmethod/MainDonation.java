package in.list.mainmethod;

import java.util.LinkedList;
import java.util.List;

import in.list.clasess.Donation;

public class MainDonation {
    public static void main(String[] args) {
        List <Donation> donationRecord=new LinkedList<>();
        donationRecord.add(new Donation("Omkar", 1000000));
        donationRecord.add(new Donation("Pankaj", 75000));
        donationRecord.add(new Donation("Tushar", 40000));
        donationRecord.add(new Donation("Vishal", 500));



        for(int i=0;i<donationRecord.size();i++){
            System.out.println(donationRecord.get(i));
        }
    }

}
