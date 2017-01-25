/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","lutti",R.drawable.number_one));
        words.add(new word("two","ottiko",R.drawable.number_two));
        words.add(new word("three","tolookosu",R.drawable.number_three));
        words.add(new word("four","oyyisa",R.drawable.number_four));
        words.add(new word("five","massokka",R.drawable.number_five));
        words.add(new word("six","temmokka",R.drawable.number_six));
        words.add(new word("seven","kenekaku",R.drawable.number_seven));
        words.add(new word("eight","kawinta",R.drawable.number_eight));
        words.add(new word("nine","wo'e",R.drawable.number_nine));
        words.add(new word("ten","na'aacha",R.drawable.number_ten));


        wordAdapter adapter = new wordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
