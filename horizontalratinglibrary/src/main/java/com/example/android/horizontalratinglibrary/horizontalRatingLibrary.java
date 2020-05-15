package com.example.android.horizontalratinglibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.DecimalFormat;

public class horizontalRatingLibrary extends RelativeLayout {

    public horizontalRatingLibrary(Context context) {
        super(context);
        initialize(context);
        ratingChart(0, 0, 0, 0, 0, 0);
    }

    public horizontalRatingLibrary(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
        ratingChart(0, 0, 0, 0, 0, 0);
    }

    private void initialize(Context context) {
        inflate(context, R.layout.myview, this);
    }

    public void setTitle(String title){
        TextView titletv = findViewById(R.id.rating_reviews);
        titletv.setText(title);
    }

    public void setData(int one, int two, int three, int four, int five, int review_no){
        ratingChart(one, two, three, four, five, review_no);
    }

    private void ratingChart(int one, int two, int three, int four, int five, int review){
        int no_rating_int = one + two + three + four + five,
                no_review_int = review,
                five_star_total_int = five,
                four_star_total_int = four,
                three_star_total_int = three,
                two_star_total_int = two,
                one_star_total_int = one;



        float overall_rating_int = ((float)5*five + 4*four + 3*three + 2*two + one)/(float)no_rating_int;
        DecimalFormat precision = new DecimalFormat("0.0");

        TextView overall_rating = findViewById(R.id.overall_rating);
        if(no_rating_int == 0){
            overall_rating.setText("0.0");
        }else {
            overall_rating.setText(precision.format(overall_rating_int));
        }

        TextView no_rating = findViewById(R.id.no_rating);
        no_rating.setText(String.valueOf(no_rating_int));

        TextView no_review = findViewById(R.id.no_review);
        no_review.setText(String.valueOf(no_review_int));

        TextView five_star_total = findViewById(R.id.five_star_total);
        five_star_total.setText(String.valueOf(five_star_total_int));

        TextView four_star_total = findViewById(R.id.four_star_total);
        four_star_total.setText(String.valueOf(four_star_total_int));

        TextView three_star_total = findViewById(R.id.three_star_total);
        three_star_total.setText(String.valueOf(three_star_total_int));

        TextView two_star_total = findViewById(R.id.two_star_total);
        two_star_total.setText(String.valueOf(two_star_total_int));

        TextView one_star_total = findViewById(R.id.one_star_total);
        one_star_total.setText(String.valueOf(one_star_total_int));

        View five_star_rating_active = findViewById(R.id.five_star_rating_active);
        View five_star_rating_not_active = findViewById(R.id.five_star_rating_not_active);
        View four_star_rating_active = findViewById(R.id.four_star_rating_active);
        View four_star_rating_not_active = findViewById(R.id.four_star_rating_not_active);
        View three_star_rating_active = findViewById(R.id.three_star_rating_active);
        View three_star_rating_not_active = findViewById(R.id.three_star_rating_not_active);
        View two_star_rating_active = findViewById(R.id.two_star_rating_active);
        View two_star_rating_not_active = findViewById(R.id.two_star_rating_not_active);
        View one_star_rating_active = findViewById(R.id.one_star_rating_active);
        View one_star_rating_not_active = findViewById(R.id.one_star_rating_not_active);

        {
            //for five star
            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float x = (float) five_star_total_int / (float) no_rating_int;
            childParam1.weight = x;
            five_star_rating_active.setLayoutParams(childParam1);

            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float y = 1f - x;
            childParam2.weight = y;
            five_star_rating_not_active.setLayoutParams(childParam2);

            LinearLayout parent = findViewById(R.id.five_star_parent);
            parent.setWeightSum(1f);
            parent.removeAllViews();
            parent.addView(five_star_rating_active);
            parent.addView(five_star_rating_not_active);
        }


        {
            //for four star
            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float x = (float) four_star_total_int / (float) no_rating_int;
            childParam1.weight = x;
            four_star_rating_active.setLayoutParams(childParam1);

            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float y = 1f - x;
            childParam2.weight = y;
            five_star_rating_not_active.setLayoutParams(childParam2);

            LinearLayout parent = findViewById(R.id.four_star_parent);
            parent.setWeightSum(1f);
            parent.removeAllViews();
            parent.addView(four_star_rating_active);
            parent.addView(four_star_rating_not_active);
        }

        {
            //for three star
            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float x = (float) three_star_total_int / (float) no_rating_int;
            childParam1.weight = x;
            three_star_rating_active.setLayoutParams(childParam1);

            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float y = 1f - x;
            childParam2.weight = y;
            three_star_rating_not_active.setLayoutParams(childParam2);

            LinearLayout parent = findViewById(R.id.three_star_parent);
            parent.setWeightSum(1f);
            parent.removeAllViews();
            parent.addView(three_star_rating_active);
            parent.addView(three_star_rating_not_active);
        }

        {
            //for two star
            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float x = (float) two_star_total_int / (float) no_rating_int;
            childParam1.weight = x;
            two_star_rating_active.setLayoutParams(childParam1);

            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float y = 1f - x;
            childParam2.weight = y;
            two_star_rating_not_active.setLayoutParams(childParam2);

            LinearLayout parent = findViewById(R.id.two_star_parent);
            parent.setWeightSum(1f);
            parent.removeAllViews();
            parent.addView(two_star_rating_active);
            parent.addView(two_star_rating_not_active);
        }

        {
            //for one star
            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float x = (float) one_star_total_int / (float) no_rating_int;
            childParam1.weight = x;
            one_star_rating_active.setLayoutParams(childParam1);

            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            float y = 1f - x;
            childParam2.weight = y;
            one_star_rating_not_active.setLayoutParams(childParam2);

            LinearLayout parent = findViewById(R.id.one_star_parent);
            parent.setWeightSum(1f);
            parent.removeAllViews();
            parent.addView(one_star_rating_active);
            parent.addView(one_star_rating_not_active);
        }

    }
}
