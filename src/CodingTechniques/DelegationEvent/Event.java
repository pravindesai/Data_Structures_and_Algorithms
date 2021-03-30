package CodingTechniques.DelegationEvent;

import java.util.ArrayList;

public class Event {
    EventListnerInterface eventListnerInterface;

    public void setEventListnerInterface(EventListnerInterface eventListnerInterface) {
        this.eventListnerInterface = eventListnerInterface;
    }

    public void Listen(int n, ArrayList<String> list){
        if (n<list.size()+1)
            eventListnerInterface.OnEventSuccess(n,list);
        else
            eventListnerInterface.OnEventFailed(list);
    }
}

class LocalListner implements EventListnerInterface{

    @Override
    public void OnEventSuccess(int i, ArrayList<String> list) {
        System.out.println(list.get(i-1));
    }

    @Override
    public void OnEventFailed(ArrayList<String> list) {
        System.out.println("FAILED : Index out of bound; ");
        System.out.println("Length is "+list.size());
    }
}
