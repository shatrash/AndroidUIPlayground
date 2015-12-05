package ajitsingh.com.androiduiplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  public static final String VIEW_TO_LOAD = "viewToLoad";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void showLinearHorizontalLayout(View view) {
    startDemo(R.layout.linear_horizontal);
  }

  public void showLinearVerticalLayout(View view) {
    startDemo(R.layout.linear_vertical);
  }

  public void showTableLayout(View view) {
    startDemo(R.layout.table_layout);
  }

  private void startDemo(int table_layout) {
    Intent intent = new Intent(this, DemoActivity.class);
    intent.putExtra(VIEW_TO_LOAD, table_layout);

    startActivity(intent);
  }
}
