import com.java.linklist.CitizenData;
import com.java.linklist.CustomLinkedList;
import com.java.linklist.CustomLinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CustomLinkedList<CitizenData> cdList = new CustomLinkedListImplementation<>();
        cdList.add(new CitizenData("Vivek SHukla", 27, "Indra nagar, Unnao"));
        cdList.add(new CitizenData("Alok", 29, "Narpat khera, Lucknow"));
        cdList.printList();
    }
}