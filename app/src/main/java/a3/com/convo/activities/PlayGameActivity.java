package a3.com.convo.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import a3.com.convo.R;
import a3.com.convo.fragments.FriendsFragment;
import a3.com.convo.fragments.GameFragment;
import a3.com.convo.fragments.ModeFragment;

public class PlayGameActivity extends AppCompatActivity {

    private FriendsFragment friendsFrag;
    private ModeFragment modeFrag;
    private GameFragment gameFrag;
    private Fragment playGameFrag;
    private FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        ft = getSupportFragmentManager().beginTransaction();

        friendsFrag = new FriendsFragment();
        modeFrag = new ModeFragment();
        gameFrag = new GameFragment();
        playGameFrag = friendsFrag;

        ft.replace(R.id.play_game_fragment, playGameFrag);
        ft.commit();
    }

    public void goToMode(){
        Fragment fragment = new ModeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.play_game_fragment, fragment);
        fragmentTransaction.commit();
    }

    public void goToGame() {
        Fragment fragment = new GameFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.play_game_fragment, fragment);
        fragmentTransaction.commit();
    }
}
