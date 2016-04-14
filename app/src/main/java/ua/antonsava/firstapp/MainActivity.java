package ua.antonsava.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView mTextSport;
    private TextView mTextStatus;
    private TextView mTextGroup;
    private TextView mTextSemiFinal;
    private TextView mTextChamp;
    private TextView mTextWinner;
    private TextView mTextGroupDay;
    private TextView mTextSemiFinalDay;
    private TextView mTextChampDay;
    private TextView mTextWinnerName;
    private TextView mTextDescription;
    private Toolbar mToolbar;
    private List<Integer> mImageList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private PictureAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        reciveDataImage();
        mAdapter = new PictureAdapter(MainActivity.this, mImageList);
        mRecyclerView.setAdapter(mAdapter);

        mTextSport = (TextView) findViewById(R.id.sport);
        mTextStatus = (TextView) findViewById(R.id.status);
        mTextGroup = (TextView) findViewById(R.id.group);
        mTextSemiFinal = (TextView) findViewById(R.id.semiFinal);
        mTextChamp = (TextView) findViewById(R.id.champ);
        mTextWinner = (TextView) findViewById(R.id.winner);
        mTextGroupDay = (TextView) findViewById(R.id.groupDay);
        mTextSemiFinalDay = (TextView) findViewById(R.id.semiFinalDay);
        mTextChampDay = (TextView) findViewById(R.id.champDay);
        mTextWinnerName = (TextView) findViewById(R.id.winnerName);
        mTextDescription = (TextView) findViewById(R.id.description);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.sport:
                        Toast toast1 = Toast.makeText(MainActivity.this, mTextSport.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                    case R.id.status:
                        Toast toast2 = Toast.makeText(MainActivity.this, mTextStatus.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case R.id.group:
                        Toast toast3 = Toast.makeText(MainActivity.this, mTextGroup.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                    case R.id.semiFinal:
                        Toast toast4 = Toast.makeText(MainActivity.this, mTextSemiFinal.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast4.show();
                        break;
                    case R.id.champ:
                        Toast toast5 = Toast.makeText(MainActivity.this, mTextChamp.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast5.show();
                        break;
                    case R.id.groupDay:
                        Toast toast6 = Toast.makeText(MainActivity.this, mTextWinner.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast6.show();
                        break;
                    case R.id.semiFinalDay:
                        Toast toast7 = Toast.makeText(MainActivity.this, mTextGroupDay.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast7.show();
                        break;
                    case R.id.champDay:
                        Toast toast8 = Toast.makeText(MainActivity.this, mTextSemiFinalDay.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast8.show();
                        break;
                    case R.id.winnerName:
                        Toast toast9 = Toast.makeText(MainActivity.this, mTextChampDay.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast9.show();
                        break;
                    case R.id.winner:
                        Toast toast10 = Toast.makeText(MainActivity.this, mTextWinnerName.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast10.show();
                        break;
                    case R.id.description:
                        Toast toast11 = Toast.makeText(MainActivity.this, mTextDescription.getClass()
                                .getSimpleName(), Toast.LENGTH_LONG);
                        toast11.show();
                        break;
                }
            }
        };

        mTextSport.setOnClickListener(onClickListener);
        mTextStatus.setOnClickListener(onClickListener);
        mTextGroup.setOnClickListener(onClickListener);
        mTextSemiFinal.setOnClickListener(onClickListener);
        mTextChamp.setOnClickListener(onClickListener);
        mTextWinner.setOnClickListener(onClickListener);
        mTextGroupDay.setOnClickListener(onClickListener);
        mTextSemiFinalDay.setOnClickListener(onClickListener);
        mTextChampDay.setOnClickListener(onClickListener);
        mTextWinnerName.setOnClickListener(onClickListener);
        mTextDescription.setOnClickListener(onClickListener);
    }

    private void reciveDataImage() {
        mImageList.add(R.drawable.ball);
        mImageList.add(R.drawable.champ);
    }
}
