package com.sirdave.perplexity.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirdave.perplexity.domain.model.SubscriptionPlan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlanCard(
    plan: SubscriptionPlan,
    modifier: Modifier = Modifier
){
    OutlinedCard(
        modifier = modifier.padding(
                start = 8.dp,
                top = 8.dp,
                bottom = 8.dp
            ),
        border = BorderStroke(1.dp, Color.White),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ) {
        Column(
            modifier = modifier.fillMaxWidth().padding(8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceAround
            ) {

            Text(
                text = plan.name,
                color = Color.White,
                fontSize = 11.sp,
            )

            Text(
                text = plan.amount,
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 8.dp)
            )


            Text(
                text = plan.extra ?: "",
                color = Color.White,
                fontSize = 9.sp,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = plan.description,
                color = Color.White,
                fontSize = 11.sp,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

val plan = SubscriptionPlan("Yearly", "$199.99" ,
    "Free 7 Day Trial", "Save $39.99")

@Composable
@Preview(name = "PlanPreview")
fun Preview(){
    PlanCard(plan = plan)
}