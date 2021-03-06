package com.erendev.todist.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.erendev.todist.R
import com.erendev.todist.base.BaseScreen


class HomeScreen : BaseScreen<HomeViewModel>() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(text = stringResource(id = R.string.app_name))
                    },
                    navigationIcon = {
                        IconButton(onClick = {

                        }) {
                            Icon(imageVector = Icons.Rounded.Menu, contentDescription = "Menu")
                        }
                    },
                    modifier = Modifier.shadow(8.dp)
                )
            },
            snackbarHost = {

            },
            content = {
                HomeContent(
                    list = listOf("1", "2", "3"),
                    onTabSelectionChanged = {

                    },
                    onAddButtonClicked = {

                    }
                )
            }
        )
    }
}