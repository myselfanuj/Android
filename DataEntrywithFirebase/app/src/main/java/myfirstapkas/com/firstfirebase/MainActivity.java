package myfirstapkas.com.firstfirebase;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase Database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = Database.getReferenceFromUrl("https://firstfirebase-31a6c.firebaseio.com/");

       final EditText ID = findViewById(R.id.ID);
       final EditText Name = findViewById(R.id.name);
       final EditText Discipline = findViewById(R.id.discipline);
       final EditText Year = findViewById(R.id.year);
        Button summit =findViewById(R.id.btn);




        summit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child(ID.getText().toString()).child("Name").setValue(Name.getText().toString());
                myRef.child(ID.getText().toString()).child("Discipline").setValue(Discipline.getText().toString());
                myRef.child(ID.getText().toString()).child("Year").setValue(Year.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(getApplicationContext(),"Data Enter Successfully",Toast.LENGTH_SHORT).show();
                    }
                });

                //    openDialog();
            }
        });

    }
     /*public void openDialog(){
         AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
         dlgAlert.setMessage("Data Enter Succesfully");
         dlgAlert.setTitle("Student's Data");
         dlgAlert.setPositiveButton("OK", null);
         dlgAlert.setCancelable(true);
         dlgAlert.create().show();
    }*/

}
