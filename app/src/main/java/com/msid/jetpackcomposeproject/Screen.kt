package com.msid.jetpackcomposeproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun PreviewItem(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map { item->
            BlogCategory(item.img, item.name, item.prof)
        }
    }
}
@Composable
fun BlogCategory(img: Int, name: String, prof: String){
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)
        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)) {
            Image(
                modifier = Modifier.size(48.dp)
                    .padding(8.dp)
                    .weight(.2f),
                painter = painterResource(img),
                contentDescription = "UserImage")

            ItemDescription(name, prof, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(name: String, prof: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = prof,
            fontWeight = FontWeight.Light,
            fontSize = 12.sp
        )
    }
}

data class Category(
    val img: Int, val name: String, val prof: String
)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.user1, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user2, "Sid", "Munk"))
    list.add(Category(R.drawable.user1, "Siddesh", "M"))
    list.add(Category(R.drawable.user2, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user1, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user2, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user1, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user2, "Sid", "Munk"))
    list.add(Category(R.drawable.user1, "Siddesh", "M"))
    list.add(Category(R.drawable.user2, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user1, "Siddeshwar", "Munde"))
    list.add(Category(R.drawable.user2, "Siddeshwar", "Munde"))
    return list
}