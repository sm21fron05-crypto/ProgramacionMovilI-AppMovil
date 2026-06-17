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


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);


        List<ItemModel> items = DataHelper.getMythologicalCreatures();


        RecyclerAdapter adapter = new RecyclerAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(ItemModel item) {
        DetailFragment detailFragment = DetailFragment.newInstance(item);
        androidx.fragment.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // 1. TU PARTE: Agregar la animación personalizada ANTES del replace
        transaction.setCustomAnimations(R.anim.fade_in, 0, 0, 0);

        // 2. CORRECCIÓN: Usar el fragment_container en lugar de 'main'
        transaction.replace(R.id.fragment_container, detailFragment);

        transaction.addToBackStack(null);
        transaction.commit();
    }
}