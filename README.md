# horizontal rating library

[![](https://jitpack.io/v/lucifer0987/horizontal-rating-library.svg)](https://jitpack.io/#lucifer0987/horizontal-rating-library)

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.lucifer0987:horizontal-rating-library:0.1.0'
	}
 
#### Example:


#### Usage:
XML file:
```
<com.example.android.horizontalratinglibrary.horizontalRatingLibrary
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/horizontal_library"/>
```

JAVA file:
```
	horizontalRatingLibrary horizontalratinglibrary = findViewById(R.id.horizontal_library);
        horizontalratinglibrary.setData(1, 2, 3, 4, 5, 5);
        horizontalratinglibrary.setTitle("Ratings Bar");
```

```setData()``` takes six arguments of integer type.  
```set Data(number of one star, number of two star, number of three star, number of four star, number of five star, number of reviews)```

Color of the rating chart:  
By default, it uses the primary color of the project.  

But, if you want to change it, you can do by specifying the color in your ```colors.xml```  
```<color name="colorRating">#FFB300</color>```

don't forget to star the repo, if you find this useful.  
Keep supporting!!
