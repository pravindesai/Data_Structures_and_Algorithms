package CodingTechniques.DelegationEvent;

import java.util.ArrayList;

public interface EventListnerInterface {

    public void OnEventSuccess(int i, ArrayList<String> list);
    public void OnEventFailed(ArrayList<String> list);

}
