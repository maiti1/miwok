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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("where are you going", "minto wuksus"));
        words.add(new word("what is your name", "tinna oyaase'na"));
        words.add(new word("my name is.....", "oyaaset"));
        words.add(new word("How ae you feeling?", "michaksas?"));
        words.add(new word("I'm feeling good", "kuchi achit"));
        words.add(new word("Are you coming?", "aanas aa?"));
        words.add(new word("Yes,I'm coming.", "aana"));
        words.add(new word("Lets go.", "yoowutis"));
        words.add(new word("Come here.", "anni nem"));


        wordAdapter adapter = new wordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
