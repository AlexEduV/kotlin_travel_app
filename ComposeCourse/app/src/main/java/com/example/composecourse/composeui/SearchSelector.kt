package com.example.composecourse.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchSelector() {

    var adultsNumberExpanded by remember { mutableStateOf(false) }
    var bedroomNumberExpanded by remember { mutableStateOf(false) }
    var priceRangeExpanded by remember { mutableStateOf(false) }

    var adultsSelectedOption by remember { mutableStateOf("1") }
    var bedroomSelectedOption by remember { mutableStateOf("1") }
    var priceRangeSelectedOption by remember { mutableStateOf("100-500") }

    val adultsOptions = listOf("1", "2", "3", "4", "5")
    val bedroomOptions = listOf("1", "2", "3")
    val priceRangeOptions = listOf("100-500", "500-750", "750-1000", "1000-1500", "1500-2000")

    Row(modifier = Modifier
        .background(
            color = Color.White.copy(alpha = 0.8f),
            shape = RoundedCornerShape(64.dp)
        )
        .fillMaxWidth()
        .height(60.dp),
        //horizontalArrangement = Arrangement.SpaceEvenly,
    ) {

        DropdownMenuWithLabel(
            expanded = adultsNumberExpanded,
            onExpandedChange = {value -> adultsNumberExpanded = value},
            selectedOption = adultsSelectedOption,
            onOptionSelected = {option -> adultsSelectedOption = option},
            options = adultsOptions,
            label = "Adults",
            modifier = Modifier.weight(0.1f),
        )

        DropdownMenuWithLabel(
            expanded = bedroomNumberExpanded,
            onExpandedChange = {value -> bedroomNumberExpanded = value},
            selectedOption = bedroomSelectedOption,
            onOptionSelected = {option -> bedroomSelectedOption = option},
            options = bedroomOptions,
            label = "Bedrooms",
            modifier = Modifier.weight(0.3f),
        )

        DropdownMenuWithLabel(
            expanded = priceRangeExpanded,
            onExpandedChange = {value -> priceRangeExpanded = value},
            selectedOption = priceRangeSelectedOption,
            onOptionSelected = {option -> priceRangeSelectedOption = option},
            options = priceRangeOptions,
            label = "$",
            modifier = Modifier.weight(0.5f),
        )

    }
}

@Composable
fun DropdownMenuWithLabel(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    options: List<String>,
    label: String,
    modifier: Modifier,
) {
    Box {
        Button(
            onClick = { onExpandedChange(!expanded) },
            modifier = modifier
                .fillMaxHeight(),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = Color.Transparent,
                contentColor = coralGreen,

            )
        ) {
            Text(text = "$selectedOption $label",)
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Dropdown Arrow"
            )
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { onExpandedChange(false) }
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    onClick = {
                        onOptionSelected(option)
                        onExpandedChange(false)
                    },
                    text = {
                        Text(option)
                    }
                )
            }
        }
    }
}