package com.example.nicholaspark.moviemvp.Views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nicholaspark.moviemvp.Helpers.MoviesContract;
import com.example.nicholaspark.moviemvp.Models.Movie;
import com.example.nicholaspark.moviemvp.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MoviesIndexFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MoviesIndexFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MoviesIndexFragment extends Fragment implements MoviesContract.View{

    private MoviesContract.Presenter mPresenter;

    private SwipeRefreshLayout swipeLayout;
    private RecyclerView recyclerView;

    private OnFragmentInteractionListener mListener;

    public MoviesIndexFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MoviesIndexFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MoviesIndexFragment newInstance(String param1, String param2) {
        MoviesIndexFragment fragment = new MoviesIndexFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies_index, container, false);

        swipeLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipeLayout);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);

        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.loadMovies(false);
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        mPresenter.result(requestCode,resultCode);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void showLoading() {

        if(getView()==null)
            return;
        //Set the refreshing to false only after the layout is done with everything
        swipeLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void showLoadingError() {

    }

    @Override
    public void showAddMovie() {

    }

    @Override
    public void showMovies(List<Movie> movies) {

    }

    @Override
    public void showNoTasks() {

    }

    @Override
    public void setPresenter(MoviesContract.Presenter presenter) {

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
