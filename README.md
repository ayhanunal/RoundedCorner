<h1 align="center"> RoundedCorner</h1>

<p align="center">
  <img src='https://github.com/ayhanunal/RoundedCorner/blob/main/ss/ezgif.com-gif-maker.gif' width=300 heihgt=300>
</p>

### Gradle 
Add a dependency code to your **module**'s `build.gradle` file.
```gradle
buildFeatures {
    viewBinding true
}
```
## View
button background

```xml
<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <corners android:radius="35dp" />

    <stroke android:width="2dp" android:color="#E10B0B" />

    <solid android:color="#E10B0B" />
</shape>
```

## Use

view binding
```kotlin
private lateinit var binding: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
  //view binding initialize
  binding = ActivityMainBinding.inflate(layoutInflater)
  val view = binding.root
  setContentView(view)
}
```

show button clicked

```kotlin
binding.showBtn.setOnClickListener {
    // show button is clicked
    val alertDialogBuilder = AlertDialog.Builder(this)

    //inflate dialog_tmp.xml
    val inflater = layoutInflater
    var dialogView = inflater.inflate(R.layout.dialog_tmp, null)

    alertDialogBuilder.setView(dialogView) // alert dialog set View

    //create alert dialog
    val alertDialog: AlertDialog = alertDialogBuilder.create()
    alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    alertDialog.setCancelable(false) // When we press the back button, we prevent it from closing
    alertDialog.setCanceledOnTouchOutside(false)
    alertDialog.show()

    val closeButton: Button = dialogView.findViewById(R.id.closeButton)
    closeButton.setOnClickListener {
        alertDialog.cancel()
    }
}
```
