package com.rba.kmmtest.android.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rba.kmmtest.TimeZoneHelper
import com.rba.kmmtest.TimeZoneHelperImpl
import kotlinx.coroutines.delay

const val timeMillis = 1000 * 60L // 1 second

@Composable
fun TimeZoneScreen(
    currentTimezoneStrings: SnapshotStateList<String>
) {
    val timezoneHelper: TimeZoneHelper = TimeZoneHelperImpl()
    val listState = rememberLazyListState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var time by remember { mutableStateOf(timezoneHelper.currentTime()) }

        LaunchedEffect(0) {
            while (true) {
                time = timezoneHelper.currentTime()
                delay(timeMillis) // Every minute
            }
        }
        LocalTimeCard(
            city = timezoneHelper.currentTimeZone(),
            time = time,
            date = timezoneHelper.getDate(timezoneHelper.currentTimeZone())
        )
        Spacer(modifier = Modifier.size(16.dp))

        // TODO: Add Timezone items
    }
}