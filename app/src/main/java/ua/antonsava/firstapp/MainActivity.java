package ua.antonsava.firstapp;

import android.app.AlertDialog;
import android.content.DialogInterface; //[Comment] Unused import
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//[Comment] Wrong toolbar and status bar colors
public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    TextView textView1; //[Comment] Use google code style. Anyway, NEVER use such names
    TextView textView2; //[Comment] Wrong visibility modifiers
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    private List<MyData> imageList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private PicAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        reciveDataImage();
        mAdapter = new PicAdapter(MainActivity.this, imageList);
        mRecyclerView.setAdapter(mAdapter);

        textView1 = (TextView) findViewById(R.id.sport);
        textView2 = (TextView) findViewById(R.id.status);
        textView3 = (TextView) findViewById(R.id.group);
        textView4 = (TextView) findViewById(R.id.semiFin);
        textView5 = (TextView) findViewById(R.id.champ);
        textView6 = (TextView) findViewById(R.id.winner);
        textView7 = (TextView) findViewById(R.id.groupDay);
        textView8 = (TextView) findViewById(R.id.semiFinDay);
        textView9 = (TextView) findViewById(R.id.champDay);
        textView10 = (TextView) findViewById(R.id.winnerName);
        textView11 = (TextView) findViewById(R.id.descrip);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.sport:
                        Toast toast1 = Toast.makeText(MainActivity.this, "TextView sport", Toast.LENGTH_LONG); //[Comment] Wrong information. Show control name. Use view.getClass().getSimpleName()
                        toast1.show();
                        break;
                    case R.id.status:
                        Toast toast2 = Toast.makeText(MainActivity.this, "TextView status", Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case R.id.group:
                        Toast toast3 = Toast.makeText(MainActivity.this, "TextView group", Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                    case R.id.semiFin:
                        Toast toast4 = Toast.makeText(MainActivity.this, "TextView semiFin", Toast.LENGTH_LONG);
                        toast4.show();
                        break;
                    case R.id.champ:
                        Toast toast5 = Toast.makeText(MainActivity.this, "TextView champ", Toast.LENGTH_LONG);
                        toast5.show();
                        break;
                    case R.id.groupDay:
                        Toast toast6 = Toast.makeText(MainActivity.this, "TextView groupDay", Toast.LENGTH_LONG);
                        toast6.show();
                        break;
                    case R.id.semiFinDay:
                        Toast toast7 = Toast.makeText(MainActivity.this, "TextView semiFinDay", Toast.LENGTH_LONG);
                        toast7.show();
                        break;
                    case R.id.champDay:
                        Toast toast8 = Toast.makeText(MainActivity.this, "TextView champDay", Toast.LENGTH_LONG);
                        toast8.show();
                        break;
                    case R.id.winnerName:
                        Toast toast9 = Toast.makeText(MainActivity.this, "TextView winnerName", Toast.LENGTH_LONG);
                        toast9.show();
                        break;
                    case R.id.winner:
                        Toast toast10 = Toast.makeText(MainActivity.this, "TextView winner", Toast.LENGTH_LONG);
                        toast10.show();
                        break;
                    case R.id.descrip:
                        Toast toast11 = Toast.makeText(MainActivity.this, "TextView description", Toast.LENGTH_LONG);
                        toast11.show();
                        break;
                }
            }
        };

    textView1.setOnClickListener(onClickListener);
    textView2.setOnClickListener(onClickListener);
    textView3.setOnClickListener(onClickListener);
    textView4.setOnClickListener(onClickListener);
    textView5.setOnClickListener(onClickListener);
    textView6.setOnClickListener(onClickListener);
    textView7.setOnClickListener(onClickListener);
    textView8.setOnClickListener(onClickListener);
    textView9.setOnClickListener(onClickListener);
    textView10.setOnClickListener(onClickListener);
    textView11.setOnClickListener(onClickListener);
}

    private void reciveDataImage() {
        imageList.add(new MyData(R.drawable.yalantis));
        imageList.add(new MyData(R.drawable.mont));
    }

    @Override
    public void onBackPressed() {
        finish();
    } //[Comment] Unnecessary. You don't need it

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu); //[Comment] You don't have menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item); //[Comment] Unnecessary method
    }
}
