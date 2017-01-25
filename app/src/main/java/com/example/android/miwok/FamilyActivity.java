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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father","apa",R.drawable.family_father));
        words.add(new word("mother","ata",R.drawable.family_mother));
        words.add(new word("son","angsi",R.drawable.family_son));
        words.add(new word("daughter","tune",R.drawable.family_daughter));
        words.add(new word("older brother","taachi",R.drawable.family_older_brother));
        words.add(new word("younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new word("older sister","tete",R.drawable.family_older_sister));
        words.add(new word("young sister","kolliti",R.drawable.family_younger_sister));
        words.add(new word("grandmother","ama",R.drawable.family_grandmother));
        words.add(new word("grandfather","paapa",R.drawable.family_grandfather));


        wordAdapter adapter = new wordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
