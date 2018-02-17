package com.droidprojects.spotifytray.controller

/**
 * Mock Song metadata
 * @author Fouad
 */
class MockSong @JvmOverloads constructor(
        var mSinger: String,
        var mTitle: String,
        var mAlbumCoverPath: String,
        var mSongDuration: Int,
        var mCurrentPlayheadPosition: Int = 0
)
