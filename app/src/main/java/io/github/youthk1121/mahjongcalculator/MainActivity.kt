package io.github.youthk1121.mahjongcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.youthk1121.mahjongcalculator.ui.theme.MahjongCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MahjongCalculatorTheme {
                TitleSurface()
            }
        }
    }
}

@Composable
fun TitleSurface() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        Title()
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleLine(text = "麻雀", modifier)
        Spacer(modifier = modifier.size(48.dp))
        TitleLine(text = "点数計算", modifier = modifier)
    }
}

@Composable
fun TitleLine(text: String, modifier: Modifier = Modifier) {
    Text(text = text, fontSize = 48.sp, modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MahjongCalculatorTheme {
        TitleSurface()
    }
}