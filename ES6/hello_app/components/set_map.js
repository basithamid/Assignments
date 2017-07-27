    let musicSet = new Set();
    let sportSet = new Set();

    let musicMsg = ["hi","how are you", "bye bye"]
    let sportMsg = ["hello", "how do you do","bye thank you"]

    musicSet.add('Basit')
    musicSet.add('Bhavdeep')
    musicSet.add('Piyush')

    sportSet.add('Ninad')
    sportSet.add('Ammar')
    sportSet.add('Ankit')

    let map = new Map();
    map.set("musicUsers", musicSet)
    map.set("musicMsg", musicMsg)
    map.set("sportUsers", sportSet)
    map.set("sportMsg", sportMsg)


function display_users(chatroom){
     console.log(map.get(chatroom))
}
function display_messages(messages){
    console.log(map.get(messages))
}

export {display_users,display_messages}
