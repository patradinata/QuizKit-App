package com.example.quizkit.ui.screen.quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizkit.R

@Composable
fun QuizStart() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary_purple)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.new_quest), contentDescription = "image data")
        Spacer(modifier = Modifier.height(16.dp))
        QuizContent()
    }
}

@Composable
fun QuizContent() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.white_background),
        )
    ) {
        Column(Modifier.padding(16.dp)) {
            ContentHeader()
            Spacer(modifier = Modifier.height(16.dp))
            QuizType()
            Spacer(modifier = Modifier.height(16.dp))
            ContentDescription()
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.white_background),
                    containerColor = colorResource(id = R.color.primary_purple)
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Let's Play", fontSize = 20.sp)
            }
        }
    }
}

@Composable
fun ContentHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column {
            Text(
                text = "Entertaiment",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Video Games",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }
        IconButton(
            modifier = Modifier
                .size(52.dp)
                .border(
                    width = 4.dp,
                    color = colorResource(id = R.color.secondary_blue),
                    shape = CircleShape
                ),
            onClick = { /*TODO*/ },
            colors = IconButtonDefaults.iconButtonColors(
                contentColor = colorResource(id = R.color.white_background),
                containerColor = colorResource(id = R.color.primary_purple)
            )
        ) {
            Icon(
                modifier = Modifier.size(36.dp),
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Settings"
            )
        }
    }
}

@Composable
fun QuizType() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = colorResource(id = R.color.tertiary_blue)
            )
            .padding(12.dp),
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BoxType(painter = R.drawable.baseline_question_mark_24, text = "10 Question")
            Spacer(modifier = Modifier.width(30.dp))
            BoxType(painter = R.drawable.baseline_ballot_24, text = "Medium")
        }
        Spacer(modifier = Modifier.height(16.dp))
        BoxType(painter = R.drawable.box_stype, text = "Mixed")
    }
}

@Composable
fun BoxType(painter:Int, text:String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Column(
            Modifier
                .clip(shape = RoundedCornerShape(6.dp))
                .background(color = colorResource(id = R.color.white))
        ) {
            Icon(
                modifier = Modifier
                    .size(32.dp)
                    .padding(4.dp),
                painter = painterResource(id = painter),
                contentDescription = text,
                tint = colorResource(id = R.color.primary_purple)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ContentDescription(){
    Column {
        Text(
            text = "Description",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "This quiz is designed to challenge players on various aspects of the gaming universe, from the classics to the latest releases.",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}



