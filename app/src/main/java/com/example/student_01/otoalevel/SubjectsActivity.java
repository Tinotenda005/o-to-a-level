package com.example.student_01.otoalevel;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);


    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();




        switch (view.getId())

        {
            case R.id.subject_mathematics:
                if (checked) {
                    {
                        selection.add("Commercials");
                    }
                } else {
                    {
                        selection.remove("Commercials");
                    }
                }
                break;
            case R.id.subject_english:
                if (checked) {
                    {
                           selection.add("");
                    }
                } else {
                    {
                         selection.remove("");
                    }
                }
                break;
            case R.id.subject_physics:
                if (checked) {
                    {
                        selection.add("Sciences");
                    }
                } else {
                    {
                        selection.remove("Sciences");
                    }
                }
                break;
            case R.id.subject_geography:
                if (checked) {
                    {
                      selection.add("");
                    }
                } else {
                    {
                      selection.remove("");
                    }
                }
                break;

            case R.id.subject_chemistry:
                if (checked) {
                    {
                        selection.add("");
                    }
                } else {
                    {
                        selection.remove("");
                    }
                }
                break;
            case R.id.subject_intergratedscience:
                if (checked) {
                    {
                        selection.add("");
                    }
                } else {
                    {
                         selection.remove("");
                    }
                }
                break;
            case R.id.subject_accounts:
                if (checked) {
                    {
                       selection.add("Commercials");
                    }
                } else {
                    {
                        selection.remove("Commercials");
                    }
                }
                break;
            case R.id.subject_biology:
                if (checked) {
                    {
                    selection.add("");
                    }
                } else {
                    {
                     selection.remove("");
                    }
                }
                break;
            case R.id.subject_shona:
                if (checked) {
                    {
                        selection.add("Arts");
                    }
                } else {
                    {
                        selection.remove("Arts");
                    }
                }
                break;
            case R.id.subject_commerce:
                if (checked) {
                    {
                          selection.add("");
                    }
                } else {
                    {
                        selection.remove("");
                    }
                }
                break;

            case R.id.subject_history:
                if (checked) {
                    {
                        selection.add("Arts");
                    }
                } else {
                    {
                        selection.remove("Arts");
                    }
                }
                break;


        }


    }


    // Button
    public void finalSelection(View view)

    {
        String final_subjects_selection = "";


        for (String Selections : selection) {
            final_subjects_selection = final_subjects_selection + Selections + "\n";
        }


      /*  final_text.setText(final_subjects_selection);
        final_text.setEnabled(true);
*/
        Intent intent = new Intent(SubjectsActivity.this,Main3Activity.class);
        intent.putExtra("final_subjects_selection",final_subjects_selection);

        startActivity(intent);



    }
}









