package ronnae.com.bo.tema5_prueba_significativa_final;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        
        // 2-column grid layout for a premium, card-album appearance
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        // Fetch items from DataHelper
        List<ItemModel> items = DataHelper.getMythologicalCreatures();

        // Set custom RecyclerAdapter
        RecyclerAdapter adapter = new RecyclerAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(ItemModel item) {
        // Create DetailFragment and pass the selected ItemModel inside a Bundle
        DetailFragment detailFragment = DetailFragment.newInstance(item);

        // Perform Fragment transaction with custom XML animation and add to back stack
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.fade_in,           // Enter animation
                        android.R.anim.fade_out,  // Exit animation
                        android.R.anim.fade_in,   // Pop enter animation (when popping detail back)
                        android.R.anim.fade_out   // Pop exit animation
                )
                .replace(R.id.fragment_container, detailFragment)
                .addToBackStack(null) // Ensures standard system back-button navigation works
                .commit();
    }
}