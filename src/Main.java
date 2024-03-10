import com.java.linklist.CitizenData;
import com.java.linklist.CustomLinkedList;
import com.java.linklist.CustomLinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<CitizenData> cdList = new CustomLinkedListImplementation<>();
        cdList.add(new CitizenData("Vivek Shukla", 27, "Indra nagar, Unnao"));
        cdList.add(new CitizenData("Alok", 29, "Narpat khera, Lucknow"));
        cdList.printList();
        cdList.addFirst(new CitizenData("Raja Ram", 9, "Ayodhya"));
        System.out.println("++++++++++++++++++ updated list after adding first position ++++++++++++++++++");
        cdList.printList();
        System.out.println(cdList.add(2, new CitizenData("Suraj", 21, "Swaroop nagar, Kanpur")));
        cdList.printList();
    }
}