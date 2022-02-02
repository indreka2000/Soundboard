package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundbool;

    private int agategelikultseeei, ahjuseitohikorragakuuskejaleppa, araveemoisas, hommikuksolidhobustest, homodeisaaju, homodhomod,
            homodjallevoi, jasabajohvidalles, jasiiskuita, kesneed, kudemas, kudumas, meileijulgenudlinnud, monestpolndsedagi,
            muidugihomod, nahkoliseljast, parastkaisidnisusees, paristeenri, pasatordid, roosadjamurgised, roosadpasatordidonraudselt, saavad,
            seemeelitabhomodkohale, sellisedarssinakorgused, tajattisiibrilahti, terveooolitallist, tubaolitihkelt, uksteener,
            vaatamaeijulgenud, vedasetme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION).setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build();
        soundbool = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(audioAttributes).build();

        } else {
            soundbool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        }

        agategelikultseeei = soundbool.load(this, R.raw.agategelikultseeeiolnudkiteener, 1);
        ahjuseitohikorragakuuskejaleppa = soundbool.load(this, R.raw.ahjuseitohikorragakuuskejaleppa, 1);
        araveemoisas = soundbool.load(this, R.raw.araveemoisas, 1);
        hommikuksolidhobustest = soundbool.load(this, R.raw.hommikuksolidhobustestainult, 1);
        homodeisaaju = soundbool.load(this, R.raw.homodeisaajumoisa, 1);
        homodhomod = soundbool.load(this, R.raw.homodhomod, 1);
        homodjallevoi = soundbool.load(this, R.raw.homodjallevoi, 1);
        jasabajohvidalles = soundbool.load(this, R.raw.jasabajohvidalles, 1);
        jasiiskuita = soundbool.load(this, R.raw.jasiiskuitaooselulesarkas, 1);
        kesneed = soundbool.load(this, R.raw.kesneedmurdsid, 1);
        kudemas = soundbool.load(this, R.raw.kudemas,1);
        kudumas = soundbool.load(this, R.raw.kudumas, 1);
        meileijulgenudlinnud = soundbool.load(this, R.raw.meileijulgenudlinnudmoisalahedalelennata,1);
        monestpolndsedagi = soundbool.load(this, R.raw.monestpoldsedagi,1);
        muidugihomod = soundbool.load(this, R.raw.muidugihomod,1);
        nahkoliseljast = soundbool.load(this, R.raw.nahkoliseljastmahanulitud,1);
        parastkaisidnisusees = soundbool.load(this, R.raw.parastkaisidnisuseessital,1);
        paristeenri = soundbool.load(this, R.raw.paristeenrileidsime,1);
        pasatordid = soundbool.load(this, R.raw.pasatordidjaidjargi,1);
        roosadjamurgised = soundbool.load(this, R.raw.roosadjamurgised,1);
        roosadpasatordidonraudselt = soundbool.load(this, R.raw.roosadpasatordidonraudselthomo,1);
        saavad = soundbool.load(this, R.raw.saavad,1);
        seemeelitabhomodkohale = soundbool.load(this, R.raw.seemeelitabhomodkohale,1);
        sellisedarssinakorgused = soundbool.load(this, R.raw.sellisedarssinakorgused,1);
        tajattisiibrilahti = soundbool.load(this, R.raw.tajattissiibrrilahti,1);
        terveooolitallist = soundbool.load(this, R.raw.terveooolitallist,1);
        tubaolitihkelt = soundbool.load(this, R.raw.tubaolitihkelthomosidtais,1);
        uksteener = soundbool.load(this, R.raw.uksteenerlasinadsisse,1);
        vaatamaeijulgenud = soundbool.load(this, R.raw.vaatamaeijulgendkeegiminna,1);
        vedasetme = soundbool.load(this, R.raw.vedasetmeiseselajalvoorsilolime,1);


    }

    public void mangi(View view) {
        switch (view.getId()) {
            case R.id.agategelikultseeeiolnudki:
                soundbool.play(agategelikultseeei, 1, 1, 1, 0, 1);
                break;
            case R.id.ahjuseitohikorraga:
                soundbool.play(ahjuseitohikorragakuuskejaleppa, 1, 1, 1, 0, 1);
                break;
            case R.id.araveemoisas:
                soundbool.play(araveemoisas, 1, 1, 1, 0, 1);
                break;
            case R.id.hommikuksolidhobustest:
                soundbool.play(hommikuksolidhobustest, 1, 1, 1, 0, 1);
                break;
            case R.id.homodeisaajumoisa:
                soundbool.play(homodeisaaju,1,1,1,0,1);
                break;
            case R.id.homodhomod:
                soundbool.play(homodhomod, 1,1,1,0,1);
                break;
            case R.id.homodjallevoi:
                soundbool.play(homodjallevoi, 1,1,1,0,1);
                break;
            case R.id.jasabajohvidalles:
                soundbool.play(jasabajohvidalles, 1,1,1,0,1);
                break;
            case R.id.jasiiskuitaoosel:
                soundbool.play(jasiiskuita, 1,1,1,0,1);
                break;
            case R.id.kesneedmurdsid:
                soundbool.play(kesneed, 1,1,1,0,1);
                break;
            case R.id.kudemas:
                soundbool.play(kudemas,1,1,1,0,1);
                break;
            case R.id.kudumas:
                soundbool.play(kudumas,1,1,1,0,1);
                break;
            case R.id.meileijulgenud:
                soundbool.play(meileijulgenudlinnud,1,1,1,0,1);
                break;
            case R.id.monestpoldsedagi:
                soundbool.play(monestpolndsedagi,1,1,1,0,1);
                break;
            case R.id.muidugihomod:
                soundbool.play(muidugihomod,1,1,1,0,1);
                break;
            case R.id.nahkoliseljast:
                soundbool.play(nahkoliseljast,1,1,1,0,1);
                break;
            case R.id.parastkaisid:
                soundbool.play(parastkaisidnisusees,1,1,1,0,1);
                break;
            case R.id.paristeenrileidsime:
                soundbool.play(paristeenri,1,1,1,0,1);
                break;
            case R.id.pasatordidjaid:
                soundbool.play(pasatordid,1,1,1,0,1);
                break;
            case R.id.roosadjamurgised:
                soundbool.play(roosadjamurgised,1,1,1,0,1);
                break;
            case R.id.roosadpasatordidonraudselt:
                soundbool.play(roosadpasatordidonraudselt,1,1,1,0,1);
                break;
            case R.id.saavad:
                soundbool.play(saavad,1,1,1,0,1);
                break;
            case R.id.seemeelitabhomodkohale:
                soundbool.play(seemeelitabhomodkohale,1,1,1,0,1);
                break;
            case R.id.sellisedarssinakorgused:
                soundbool.play(sellisedarssinakorgused,1,1,1,0,1);
                break;
            case R.id.tajattissiibri:
                soundbool.play(tajattisiibrilahti,1,1,1,0,1);
                break;
            case R.id.terveoo:
                soundbool.play(terveooolitallist,1,1,1,0,1);
                break;
            case R.id.tubaolitihkelt:
                soundbool.play(tubaolitihkelt,1,1,1,0,1);
                break;
            case R.id.uksteener:
                soundbool.play(uksteener,1,1,1,0,1);
                break;
            case R.id.vaatamaeijulgenud:
                soundbool.play(vaatamaeijulgenud,1,1,1,0,1);
                break;
            case R.id.vedasetmeise:
                soundbool.play(vedasetme,1,1,1,0,1);
                break;



        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundbool.release();
        soundbool = null;
    }
}