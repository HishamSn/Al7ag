package al7ag.z1tec.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import al7ag.z1tec.R;

/**
 * Created by SS on 2/1/2017.
 */

public class SweetsFragment extends Fragment
{
public SweetsFragment()
{}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //    Title = (TextView) findViewById(R.id.textView);
        return inflater.inflate(R.layout.fragment_rest, container, false);
    }
}
