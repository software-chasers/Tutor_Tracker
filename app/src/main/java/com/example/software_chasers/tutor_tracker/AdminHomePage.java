package com.example.software_chasers.tutor_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;




public class AdminHomePage extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    TextView textview,textview1,textview2,textview3,textview4,textview5,textview6,textview7,textview8,textview9,textview10,textview11,textview12
            ,textview13,textview14,textview15,textview16,textview17,textview18,textview19,textview20,textview21,textview22,textview23,textview24,textview25,
            textview26,textview27,textview28,textview29,textview30,textview31,textview32,textview33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textview = (TextView) findViewById(R.id.textView15);
        textview1 = (TextView) findViewById(R.id.textView18);
        textview2 = (TextView) findViewById(R.id.textView19);
        textview3 = (TextView) findViewById(R.id.textView20);
        textview4 = (TextView) findViewById(R.id.textView17);
        textview5 = (TextView) findViewById(R.id.textView21);
        textview6 = (TextView) findViewById(R.id.textView22);
        textview7 = (TextView) findViewById(R.id.textView23);
        textview8 = (TextView) findViewById(R.id.textView24);
        textview9 = (TextView) findViewById(R.id.textView25);
        textview10 = (TextView) findViewById(R.id.textView26);
        textview11 = (TextView) findViewById(R.id.textView27);
        textview12 = (TextView) findViewById(R.id.textView28);
        textview13 = (TextView) findViewById(R.id.textView29);
        textview14 = (TextView) findViewById(R.id.textView30);
        textview15 = (TextView) findViewById(R.id.textView31);
        textview16 = (TextView) findViewById(R.id.textView32);
        textview17 = (TextView) findViewById(R.id.textView33);
        textview18 = (TextView) findViewById(R.id.textView34);
        textview19 = (TextView) findViewById(R.id.textView35);
        textview20 = (TextView) findViewById(R.id.textView36);
        textview21 = (TextView) findViewById(R.id.textView37);
        textview22 = (TextView) findViewById(R.id.textView38);
        textview23 = (TextView) findViewById(R.id.textView39);
        textview24 = (TextView) findViewById(R.id.textView40);
        textview25 = (TextView) findViewById(R.id.textView41);
        textview26 = (TextView) findViewById(R.id.textView42);
        textview27 = (TextView) findViewById(R.id.textView43);
        textview28 = (TextView) findViewById(R.id.textView44);
        textview29 = (TextView) findViewById(R.id.textView45);
        textview30 = (TextView) findViewById(R.id.textView46);
        textview31 = (TextView) findViewById(R.id.textView47);
        textview32 = (TextView) findViewById(R.id.textView48);
        textview33 = (TextView) findViewById(R.id.textView49);


        textview.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int id = textview.getId();
        if (id == R.id.textView15) {
            Intent intent = new Intent(AdminHomePage.this, View_Application.class);
            startActivity(intent);


        }

    }
});
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id1 = textview1.getId();
                if (id1 == R.id.textView18) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id2 = textview2.getId();
                if (id2 == R.id.textView19) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id3 = textview3.getId();
                if (id3 == R.id.textView20) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id4 = textview4.getId();
                if (id4 == R.id.textView17) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id5 = textview5.getId();
                if (id5 == R.id.textView21) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview6.getId();
                if (id6 == R.id.textView22) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview7.getId();
                if (id6 == R.id.textView23) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview8.getId();
                if (id6 == R.id.textView24) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview9.getId();
                if (id6 == R.id.textView25) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview10.getId();
                if (id6 == R.id.textView26) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview11.getId();
                if (id6 == R.id.textView27) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview12.getId();
                if (id6 == R.id.textView28) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview13.getId();
                if (id6 == R.id.textView29) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview14.getId();
                if (id6 == R.id.textView30) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview15.getId();
                if (id6 == R.id.textView31) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview16.getId();
                if (id6 == R.id.textView32) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview17.getId();
                if (id6 == R.id.textView33) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview18.getId();
                if (id6 == R.id.textView34) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview19.getId();
                if (id6 == R.id.textView35) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview20.getId();
                if (id6 == R.id.textView36) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview21.getId();
                if (id6 == R.id.textView37) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview22.getId();
                if (id6 == R.id.textView38) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview23.getId();
                if (id6 == R.id.textView39) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview24.getId();
                if (id6 == R.id.textView40) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview25.getId();
                if (id6 == R.id.textView41) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview26.getId();
                if (id6 == R.id.textView42) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview27.getId();
                if (id6 == R.id.textView43) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview28.getId();
                if (id6 == R.id.textView44) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview29.getId();
                if (id6 == R.id.textView45) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview30.getId();
                if (id6 == R.id.textView46) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview31.getId();
                if (id6 == R.id.textView47) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview32.getId();
                if (id6 == R.id.textView48) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
        textview33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id6 = textview33.getId();
                if (id6 == R.id.textView49) {
                    Intent intent = new Intent(AdminHomePage.this, View_Application.class);
                    startActivity(intent);


                }

            }
        });
       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.admin_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_sign_out) {
            Intent intent = new Intent(AdminHomePage.this, MainActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.view) {
            Intent intent = new Intent(com.example.software_chasers.tutor_tracker.AdminHomePage.this, View_profile.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
