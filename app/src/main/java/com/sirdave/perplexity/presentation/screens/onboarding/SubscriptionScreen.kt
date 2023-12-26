package com.sirdave.perplexity.presentation.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirdave.perplexity.R
import com.sirdave.perplexity.domain.model.SubscriptionPlan
import com.sirdave.perplexity.presentation.composables.PlanCard
import com.sirdave.perplexity.ui.theme.LightBlue

@Composable
fun SubscriptionScreen(features: List<String>) {
    val monthlyPlan = SubscriptionPlan("Monthly", "$19.99",
        "Billed monthly")

    val yearlyPlan = SubscriptionPlan("Yearly", "$199.99",
        "Free 7 Day Trial", "Save $39.99")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background_two),
                contentScale = ContentScale.FillHeight
            )
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Restore",
                    textAlign = TextAlign.End,
                    color = Color.White
                )
            }

            Column (
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "perplexity",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )

                Text(
                    text = "Unlock the most powerful AI research assistant",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            LazyColumn(horizontalAlignment = Alignment.Start){
                items(items = features){ feature ->
                    TextWithIcon(feature = feature)
                }
            }
            
            Column(modifier = Modifier.padding(top = 16.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                ) {
                    PlanCard(
                        plan = monthlyPlan,
                        modifier = Modifier
                            .weight(1f)
                            .height(IntrinsicSize.Min)
                    )
                    PlanCard(
                        plan = yearlyPlan,
                        modifier = Modifier
                            .weight(1f)
                            .height(IntrinsicSize.Min)
                    )
                }
            }

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBlue,
                    contentColor = Color.DarkGray
                )
            ) {
                Text(text = "Subscribe")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, start = 8.dp, end = 8.dp),
                text = "The subscription will automatically renew unless it is canceled at least 24 hours before the end of the current period.",
                color = Color.White,
                fontSize = 10.sp
            )
        }
    }
}

@Composable
fun TextWithIcon(feature: String){
    Row(
        modifier = Modifier.padding(horizontal = 8.dp)
    ){
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            tint = LightBlue
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = feature,
            color = Color.White,
            fontSize = 13.sp
        )
    }
}

val features = listOf(
    "Over 300 copilot uses per day",
    "Unlock GPT-4 and Claude-2",
    "Pro support from our team",
    "Early access to new features"
)

@Composable
@Preview(name = "subscription", showBackground = true)
fun SubscriptionPreview(){
    SubscriptionScreen(features)
}

