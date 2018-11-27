package com.example.mdsuhelrana.weather;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by Zakir on 05-Jan-18.
 */

public class SearchSuggestions extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY = "SearchSuggestions";
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SearchSuggestions() {
        setupSuggestions(AUTHORITY,MODE);
    }
}
