package com.example.jesus.estudio;

import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by Jesus on 09/01/2018.
 */

final class PreLollipopSoundPool {
    @SuppressWarnings("deprecation")
    public static SoundPool NewSoundPool() {
        return new SoundPool(1, AudioManager.STREAM_MUSIC,0);
    }
}