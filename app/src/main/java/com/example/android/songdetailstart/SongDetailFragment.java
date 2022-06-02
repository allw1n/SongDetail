package com.example.android.songdetailstart;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.songdetailstart.content.SongUtils;

public class SongDetailFragment extends Fragment {

    public SongUtils.Song song;

    public SongDetailFragment() {
        // Required empty public constructor
    }

    public static SongDetailFragment newInstance(String param1, String param2) {
        SongDetailFragment fragment = new SongDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_detail, container, false);

        if (song != null) {
            ((AppCompatTextView) rootView.findViewById(R.id.song_detail))
                    .setText(song.details);
        }
        return rootView;
    }
}