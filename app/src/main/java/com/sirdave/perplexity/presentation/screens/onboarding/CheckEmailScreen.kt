package com.sirdave.perplexity.presentation.screens.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckEmailScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Check your email",
                fontSize = 21.sp,
                fontWeight = FontWeight.Light
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "A sign in link has been sent to your email address",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
@Preview(name = "Check Email", showBackground = true)
fun ConfirmEmailPreview(){
    CheckEmailScreen()
}