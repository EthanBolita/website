// Define an object to hold the shopping cart data and related functions
var shoppingCart = {
    items: [], // Array to store items in the cart

    // Function to add an item to the cart
    addItem: function(item) {
        this.items.push(item);
        // Update cart UI
        updateCartUI();
    }
};

// Function to update the cart UI with the current items in the cart
function updateCartUI() {
    var cartItemsElement = document.getElementById('cartItems');
    cartItemsElement.innerHTML = ''; // Clear previous items

    shoppingCart.items.forEach(function(item) {
        var li = document.createElement('li');
        li.textContent = `${item.quantity} ${item.size} ${item.color}`;
        cartItemsElement.appendChild(li);
    });
}

// Function to add an item to the cart when the "Add to Cart" button is clicked
function addToCart() {
    var size = document.getElementById('sizes').value;
    var color = document.getElementById('color').value;
    var quantity = parseInt(document.getElementById('quantity').value);

    var newItem = {
        size: size,
        color: color,
        quantity: quantity
    };

    shoppingCart.addItem(newItem);
}

// Attach the addToCart function to the click event of the "Add to Cart" button
document.querySelector('.cartBtn').addEventListener('click', addToCart);
