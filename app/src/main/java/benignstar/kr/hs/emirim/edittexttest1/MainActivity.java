package benignstar.kr.hs.emirim.edittexttest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ET=(EditText)findViewById(R.id.edit1);
        Button btn=(Button)findViewById(R.id.but_ok);
        TextView v=(TextView)findViewById(R.id.text_result);

        String str=ET.getText().toString();

    }
}
