package ronnae.com.bo.tema5_prueba_significativa_final;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    private static final String ARG_ITEM = "extra_item";

    public DetailFragment() {

    }


    public static DetailFragment newInstance(ItemModel item) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_ITEM, item);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);


        ImageView detailImage = view.findViewById(R.id.detailImage);
        ImageButton btnBack = view.findViewById(R.id.btnBack);

        TextView detailName = view.findViewById(R.id.detailName);
        TextView detailOrigin = view.findViewById(R.id.detailOrigin);
        TextView detailCategory = view.findViewById(R.id.detailCategory);
        TextView detailDescription = view.findViewById(R.id.detailDescription);

        TextView detailPower = view.findViewById(R.id.detailPower);
        TextView detailHabitat = view.findViewById(R.id.detailHabitat);
        TextView detailWeakness = view.findViewById(R.id.detailWeakness);


        if (getArguments() != null) {
            ItemModel item = (ItemModel) getArguments().getSerializable(ARG_ITEM);

            if (item != null) {

                detailImage.setImageResource(item.getDrawableId());
                detailName.setText(item.getName());
                detailOrigin.setText(item.getOrigin());
                detailCategory.setText(item.getCategory());
                detailDescription.setText(item.getDescription());

                detailPower.setText(item.getPower());
                detailHabitat.setText(item.getHabitat());
                detailWeakness.setText(item.getWeakness());
            }
        }


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getParentFragmentManager() != null) {
                    getParentFragmentManager().popBackStack();
                }
            }
        });

        return view;
    }
}