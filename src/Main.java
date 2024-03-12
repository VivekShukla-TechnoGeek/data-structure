import com.java.linklist.CitizenData;
import com.java.linklist.CustomLinkedList;
import com.java.linklist.CustomLinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<CitizenData> cdList = new CustomLinkedListImplementation<>();
        CitizenData citizen1 = new CitizenData("Vivek Shukla", 27, "Indra nagar, Unnao");
        CitizenData citizen2 = new CitizenData("Alok", 29, "Narpat khera, Lucknow");
        cdList.add(citizen1);
        cdList.add(citizen2);
        cdList.printList();
        CitizenData citizen3 = new CitizenData("Raja Ram", 9, "Ayodhya");
        cdList.addFirst(citizen3);
        System.out.println("++++++++++++++++++ updated list after adding first position ++++++++++++++++++");
        cdList.printList();
        CitizenData citizen4 = new CitizenData("Suraj", 21, "Swaroop nagar, Kanpur");
        System.out.println(cdList.add(2, citizen4));
        cdList.printList();
        cdList.remove(3);
        System.out.println("++++++++++++++++++ updated list after removing element from index ++++++++++++++++++");
        cdList.printList();
        System.out.println(cdList.size());
        cdList.remove(citizen1);
        cdList.printList();
    }
}