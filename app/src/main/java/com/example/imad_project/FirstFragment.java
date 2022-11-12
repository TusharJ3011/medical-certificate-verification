package com.example.imad_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.imad_project.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    ArrayList<String[]> list = new ArrayList<>();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {


        list.add(new String[]{"Personal Work", "Approved for 2 days", "Approved by Shweta Bhandari", "Pending"});
        list.add(new String[]{"Personal Work", "Approved for 2 days", "Approved by Shweta Bhandari", "Pending"});
        list.add(new String[]{"Personal Work", "Approved for 2 days", "Approved by Shweta Bhandari", "Pending"});
        list.add(new String[]{"Personal Work", "Approved for 2 days", "Approved by Shweta Bhandari", "Pending"});
        list.add(new String[]{"Personal Work", "Approved for 2 days", "Approved by Shweta Bhandari", "Pending"});

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        StudentAdapter adapter = new StudentAdapter(list, getContext());
        binding.charRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.charRecyclerView.setLayoutManager(layoutManager);

        return binding.getRoot();

    }

//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}