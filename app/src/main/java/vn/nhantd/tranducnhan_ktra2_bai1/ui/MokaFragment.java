package vn.nhantd.tranducnhan_ktra2_bai1.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import vn.nhantd.tranducnhan_ktra2_bai1.R;
import vn.nhantd.tranducnhan_ktra2_bai1.model.Cafe;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MokaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MokaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Cafe cafe;

    // TODO: Rename and change types of parameters
    private int mParam1;
    private String mParam2;

    public MokaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CherryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MokaFragment newInstance(int param1, String param2) {
        MokaFragment fragment = new MokaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            cafe = new Cafe(mParam1, mParam2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_moka, container, false);
        ImageView imageView = v.findViewById(R.id.img);
        TextView textView = v.findViewById(R.id.textview);
        imageView.setImageResource(cafe.getImg());
        textView.setText(cafe.getTitle());

        return v;
    }
}