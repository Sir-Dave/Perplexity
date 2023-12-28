package com.sirdave.perplexity.presentation.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirdave.perplexity.R
import com.sirdave.perplexity.ui.theme.DarkGreen
import com.sirdave.perplexity.ui.theme.LightBackground

@Composable
fun CreateAccountScreen(onContinueClick: () -> Unit){
    var username by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = stringResource(R.string.create_your_accout),
                fontSize = 21.sp,
                fontWeight = FontWeight.Light
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(R.drawable.person_add),
                contentDescription = "account_avatar",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(LightBackground)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(text = stringResource(R.string.username)) },
                placeholder = { Text(text = stringResource(R.string.username)) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
        }

        Button(
            onClick = { onContinueClick() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkGreen,
                contentColor = Color.White
            ),
            enabled = username.isNotBlank()
        ) {
            Text(text = stringResource(R.string.text_continue))
        }
    }
}

@Composable
@Preview(name = "Create Account", showBackground = true)
fun CreateAccountPreview(){
    CreateAccountScreen{

    }
}