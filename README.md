# Android_Add_2_Nums
Simple App to Take 2 numbers form user and add them

# Code

#### 1st Activity 
```
Button addButton;
TextView putView;
EditText Number1, Number2;
    
int n1, n2, ans;

//list the items
addButton = findViewById(R.id.addButton);
putView = findViewById(R.id.putView);
Number1 = findViewById(R.id.Number1);
Number2 = findViewById(R.id.Number2);

        //add numbers when button is clicked
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the 2 number given by the user
                n1 = Integer.parseInt(Number1.getText().toString());
                n2 = Integer.parseInt(Number2.getText().toString());
                ans = n1 + n2;

                putView.setText(n1 + " + " + n2 + " = " + ans);
            }
        });
```

# App Highlight

<img src="app_images/Add Code.png" width="1000" /><br>

<img src="app_images/Add App.png" width="300" /><br>
